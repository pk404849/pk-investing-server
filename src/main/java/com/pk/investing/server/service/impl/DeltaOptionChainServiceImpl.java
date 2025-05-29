package com.pk.investing.server.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pk.investing.server.business.DeltaOptionChainBusiness;
import com.pk.investing.server.converter.ApiConverter;
import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.model.DeltaOptionChainDataModel;
import com.pk.investing.server.model.DeltaOptionChainModel;
import com.pk.investing.server.service.DeltaOptionChainService;
import com.pk.investing.server.service.kafka.KafkaConsumerService;
import com.pk.investing.server.service.scheduler.DeltaOptionChainServiceScheduler;
import com.pk.investing.server.util.DeltaOptionChainConstant;

@Service
public class DeltaOptionChainServiceImpl implements DeltaOptionChainService {

	@Autowired
	private DeltaOptionChainBusiness deltaOptionChainBusiness;

//	@Autowired
//	private DeltaOptionChainServiceScheduler serviceScheduler;
	@Autowired
	private KafkaConsumerService kafkaConsumerService;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<DeltaOptionChainData> saveDeltaOptionChainData(List<DeltaOptionChainData> deltaOptionChainDataList) {
		return deltaOptionChainBusiness.saveDeltaOptionChainData(deltaOptionChainDataList);
	}

	@Override
	public Map<String, List<DeltaOptionChainDataModel>> fetchDeltaOptionChainData(LocalDateTime localDateTime) {
		Map<String, List<DeltaOptionChainDataModel>> dataModelMap = null;
		List<DeltaOptionChainData> dataList = deltaOptionChainBusiness.fetchDeltaOptionChainData(localDateTime);
		if (dataList != null && !dataList.isEmpty()) {
			List<DeltaOptionChainDataModel> dataModelList = ApiConverter
					.getDeltaOptionChainDataModelListObject(dataList);
			dataModelMap = dataModelList.stream().collect(Collectors.groupingBy(d -> d.getDescription()));
		}
		return dataModelMap;
	}

	@Override
	public Map<String, List<DeltaOptionChainDataModel>> fetchDeltaOptionChainCurrentData(String currency,
			String strDateTime) {
		DeltaOptionChainConstant.EXPIRY_DATES = strDateTime;
		DeltaOptionChainConstant.UNDERLYING_ASSET_SYMBOLS = currency;
		String deltaApiBaseUrl = DeltaOptionChainConstant.DELTA_OPTION_CHAIN_API_BASE_URL;
		String contractType = DeltaOptionChainConstant.CONTRACT_TYPE;
		// String currency = DeltaOptionChainConstant.UNDERLYING_ASSET_SYMBOLS;
		String expiryDate = strDateTime;

		String deltaApiUrl = deltaApiBaseUrl + "?" + "contract_type=" + contractType + "&" + "underlying_asset_symbols="
				+ currency + "&" + "expiry_date=" + expiryDate;
		DeltaOptionChainModel deltaOptionChainModel = restTemplate.getForObject(deltaApiUrl,
				DeltaOptionChainModel.class);
		if (deltaOptionChainModel != null) {
			List<DeltaOptionChainDataModel> modelList = deltaOptionChainModel.getResult();
			if (modelList != null && !modelList.isEmpty()) {
				Map<String, List<DeltaOptionChainDataModel>> dataMap = modelList.stream()
						.collect(Collectors.groupingBy(data -> data.getDescription()));
				return dataMap;
			}
		}

		return null;
	}

}
