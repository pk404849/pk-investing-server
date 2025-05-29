package com.pk.investing.server.service.scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pk.investing.server.converter.ApiConverter;
import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.model.DeltaOptionChainDataModel;
import com.pk.investing.server.model.DeltaOptionChainModel;
import com.pk.investing.server.model.OptionDataModel;
import com.pk.investing.server.service.DeltaOptionChainService;
import com.pk.investing.server.service.kafka.KafkaProducerService;
import com.pk.investing.server.util.DeltaOptionChainConstant;

@Service
public class DeltaOptionChainServiceScheduler {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private KafkaProducerService kafkaProducerService;
	
	@Autowired
	private DeltaOptionChainService deltaOptionChainService;

	@Scheduled(fixedDelay = 10000)
	public Map<String, List<DeltaOptionChainDataModel>> fetchDeltaOptionChainData() {
		String deltaApiBaseUrl = DeltaOptionChainConstant.DELTA_OPTION_CHAIN_API_BASE_URL;
		String contractType = DeltaOptionChainConstant.CONTRACT_TYPE;
		String currency = DeltaOptionChainConstant.UNDERLYING_ASSET_SYMBOLS;
		String expiryDate = DeltaOptionChainConstant.EXPIRY_DATES;

		String deltaApiUrl = deltaApiBaseUrl + "?" + "contract_type=" + contractType + "&"
				+ "underlying_asset_symbols=" + currency + "&" + "expiry_date=" + expiryDate;
		DeltaOptionChainModel deltaOptionChainModel = restTemplate.getForObject(deltaApiUrl,
				DeltaOptionChainModel.class);
		List<DeltaOptionChainDataModel> deltaOptionChainDataModelList = deltaOptionChainModel.getResult();
		if(deltaOptionChainDataModelList != null && !deltaOptionChainDataModelList.isEmpty()) {
			List<DeltaOptionChainData> deltaOptionChainDataList= ApiConverter.getDeltaOptionChainDataJpaListObject(deltaOptionChainDataModelList);
			if(deltaOptionChainDataList != null && !deltaOptionChainDataList.isEmpty()) {
				//deltaOptionChainService.saveDeltaOptionChainData(deltaOptionChainDataList);
			}
			Map<String, List<DeltaOptionChainDataModel>> dataModelMap = deltaOptionChainDataModelList.stream().collect(Collectors.groupingBy(data->data.getDescription()));
			
			Map<String, List<DeltaOptionChainDataModel>> dataMap = deltaOptionChainDataModelList.stream().collect(Collectors.groupingBy(s->s.getStrike_price()));
			List<OptionDataModel> optionDataModelList  = new ArrayList<OptionDataModel>();
			for(Map.Entry<String, List<DeltaOptionChainDataModel>> map:dataMap.entrySet()) {
				List<DeltaOptionChainDataModel> value = map.getValue();
				String key = map.getKey();
				OptionDataModel optionDataModel = new OptionDataModel();
				for(DeltaOptionChainDataModel data: value) {
					if(key.equalsIgnoreCase(data.getStrike_price())) {
						if(data.getDescription().contains("Put")) {
							optionDataModel.setPutData(data);
						}else if(data.getDescription().contains("Call")) {
							optionDataModel.setCallData(data);
						}
						optionDataModel.setStrikePrice(key);
					}
				}
				optionDataModelList.add(optionDataModel);
			}
		kafkaProducerService.sendMessage(optionDataModelList);
		return dataModelMap;
		}
		return null;
	}
}
