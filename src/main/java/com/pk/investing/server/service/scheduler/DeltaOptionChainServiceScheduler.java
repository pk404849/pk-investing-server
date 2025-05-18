package com.pk.investing.server.service.scheduler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pk.investing.server.converter.ApiConverter;
import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.model.DeltaOptionChainDataModel;
import com.pk.investing.server.model.DeltaOptionChainModel;
import com.pk.investing.server.service.DeltaOptionChainService;
import com.pk.investing.server.service.kafka.KafkaProducerService;
import com.pk.investing.server.util.DeltaOptionChainConstant;
import com.pk.investing.server.util.Util;

@Service
public class DeltaOptionChainServiceScheduler {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private KafkaProducerService kafkaProducerService;
	
	@Autowired
	private DeltaOptionChainService deltaOptionChainService;

	@Scheduled(fixedDelay = 600000)
	public List<DeltaOptionChainDataModel> fetchDeltaOptionChainData() {
		String deltaApiBaseUrl = DeltaOptionChainConstant.DELTA_OPTION_CHAIN_API_BASE_URL;
		String contractType = DeltaOptionChainConstant.CONTRACT_TYPE;
		String symbol = DeltaOptionChainConstant.UNDERLYING_ASSET_SYMBOLS;
		String expiryDate = DeltaOptionChainConstant.EXPIRY_DATES;

		String deltaApiUrl = deltaApiBaseUrl + "?" + "contract_type=" + contractType + "&"
				+ "underlying_asset_symbols=" + symbol + "&" + "expiry_date=" + expiryDate;
		DeltaOptionChainModel deltaOptionChainModel = restTemplate.getForObject(deltaApiUrl,
				DeltaOptionChainModel.class);
		List<DeltaOptionChainDataModel> deltaOptionChainDataModelList = deltaOptionChainModel.getResult();
		if(deltaOptionChainDataModelList != null && !deltaOptionChainDataModelList.isEmpty()) {
			List<DeltaOptionChainData> deltaOptionChainDataList= ApiConverter.getDeltaOptionChainDataJpaListObject(deltaOptionChainDataModelList);
			if(deltaOptionChainDataList != null && !deltaOptionChainDataList.isEmpty()) {
				kafkaProducerService.sendMessage(deltaOptionChainDataList.toString());
				deltaOptionChainService.saveDeltaOptionChainData(deltaOptionChainDataList);
			}
		}
		return deltaOptionChainDataModelList;
	}
}
