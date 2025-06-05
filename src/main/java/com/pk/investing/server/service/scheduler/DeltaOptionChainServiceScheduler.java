package com.pk.investing.server.service.scheduler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pk.investing.server.converter.ApiConverter;
//import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.model.DeltaOptionChainDataGreeksModel;
import com.pk.investing.server.model.DeltaOptionChainDataModel;
import com.pk.investing.server.model.DeltaOptionChainDataQuotesModel;
import com.pk.investing.server.model.DeltaOptionChainModel;
import com.pk.investing.server.model.OptionDataModel;
import com.pk.investing.server.service.DeltaOptionChainService;
import com.pk.investing.server.service.kafka.KafkaProducerService;
import com.pk.investing.server.util.DeltaOptionChainConstant;
import com.pk.investing.server.util.DeltaOptionChainUtil;

import ch.qos.logback.classic.pattern.Util;

@Service
public class DeltaOptionChainServiceScheduler {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private KafkaProducerService kafkaProducerService;

	@Autowired
	private DeltaOptionChainService deltaOptionChainService;

	//@Scheduled(fixedDelay = 10000)
	public void fetchDeltaOptionChainData() {
		String deltaApiBaseUrl = DeltaOptionChainConstant.DELTA_OPTION_CHAIN_API_BASE_URL;
		String contractType = DeltaOptionChainConstant.CONTRACT_TYPE;
		String currency = DeltaOptionChainConstant.UNDERLYING_ASSET_SYMBOLS;
		//String expiryDate = DeltaOptionChainConstant.EXPIRY_DATES;
		
		String expiryDate = DeltaOptionChainConstant.EXPIRY_DATES;
		if(expiryDate == null || expiryDate.isEmpty()) {
			expiryDate = DeltaOptionChainUtil.localDateToString();
			LocalDateTime localDateTime = LocalDateTime.now();
			if(localDateTime.getHour()>=18) {
				LocalDate localDate = LocalDate.now();
				LocalDate plusDays = localDate.plusDays(1);
				expiryDate = DeltaOptionChainUtil.localDateToString(plusDays);
			}
			//DeltaOptionChainConstant.EXPIRY_DATES=expiryDate;
		}
		String deltaApiUrl = deltaApiBaseUrl + "?" + "contract_type=" + contractType + "&" + "underlying_asset_symbols="
				+ currency + "&" + "expiry_date=" + expiryDate;
		DeltaOptionChainModel deltaOptionChainModel = restTemplate.getForObject(deltaApiUrl,
				DeltaOptionChainModel.class);
		List<DeltaOptionChainDataModel> deltaOptionChainDataModelList = deltaOptionChainModel.getResult();
		if (deltaOptionChainDataModelList != null && !deltaOptionChainDataModelList.isEmpty()) {
			//List<DeltaOptionChainData> deltaOptionChainDataList = ApiConverter
					//.getDeltaOptionChainDataJpaListObject(deltaOptionChainDataModelList);
			//if (deltaOptionChainDataList != null && !deltaOptionChainDataList.isEmpty()) {
				// deltaOptionChainService.saveDeltaOptionChainData(deltaOptionChainDataList);
			//}
//			Map<String, List<DeltaOptionChainDataModel>> dataModelMap = deltaOptionChainDataModelList.stream()
//					.collect(Collectors.groupingBy(data -> data.getDescription()));
			List<OptionDataModel> sortedModelLost= ApiConverter.getOptionDataModelList(deltaOptionChainDataModelList);
			kafkaProducerService.sendMessage(sortedModelLost);
		}
	}
}
