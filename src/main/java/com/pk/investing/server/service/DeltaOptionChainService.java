package com.pk.investing.server.service;

import java.util.List;

import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.model.DeltaOptionChainDataModel;

public interface DeltaOptionChainService {

	public DeltaOptionChainDataModel fetchDeltaOptionChainData();
	public List<DeltaOptionChainData> saveDeltaOptionChainData(List<DeltaOptionChainData> deltaOptionChainDataList);
	
}
