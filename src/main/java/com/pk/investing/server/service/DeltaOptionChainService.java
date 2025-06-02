package com.pk.investing.server.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.model.DeltaOptionChainDataModel;
import com.pk.investing.server.model.OptionDataModel;

public interface DeltaOptionChainService {

	public Map<String, List<DeltaOptionChainDataModel>> fetchDeltaOptionChainData(LocalDateTime localDateTime);
	
	public List<DeltaOptionChainData> saveDeltaOptionChainData(List<DeltaOptionChainData> deltaOptionChainDataList);
	
	public List<OptionDataModel> fetchDeltaOptionChainCurrentData(String currency, String strToDateTime);
	
}
