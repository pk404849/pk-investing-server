package com.pk.investing.server.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.investing.server.business.DeltaOptionChainBusiness;
import com.pk.investing.server.converter.ApiConverter;
import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.model.DeltaOptionChainDataModel;
import com.pk.investing.server.service.DeltaOptionChainService;

@Service
public class DeltaOptionChainServiceImpl implements DeltaOptionChainService {

	@Autowired
	private DeltaOptionChainBusiness deltaOptionChainBusiness;
	
	@Override
	public List<DeltaOptionChainData> saveDeltaOptionChainData(List<DeltaOptionChainData> deltaOptionChainDataList) {
		return deltaOptionChainBusiness.saveDeltaOptionChainData(deltaOptionChainDataList);
	}

	@Override
	public Map<String, List<DeltaOptionChainDataModel>> fetchDeltaOptionChainData(LocalDateTime localDateTime) {
		Map<String, List<DeltaOptionChainDataModel>> dataModelMap = null;
		List<DeltaOptionChainData> dataList = deltaOptionChainBusiness.fetchDeltaOptionChainData(localDateTime);
		if(dataList != null && !dataList.isEmpty()) {
			List<DeltaOptionChainDataModel> dataModelList = ApiConverter.getDeltaOptionChainDataModelListObject(dataList);
			dataModelMap = dataModelList.stream().collect(Collectors.groupingBy(d->d.getDescription()));
		}
		return dataModelMap;
	}

}
