package com.pk.investing.server.business;

import java.time.LocalDateTime;
import java.util.List;

import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.model.DeltaOptionChainDataModel;

public interface DeltaOptionChainBusiness {

	public List<DeltaOptionChainData> fetchDeltaOptionChainData(LocalDateTime localDateTime);
	public List<DeltaOptionChainData> saveDeltaOptionChainData(List<DeltaOptionChainData> deltaOptionChainDataList);
	
}
