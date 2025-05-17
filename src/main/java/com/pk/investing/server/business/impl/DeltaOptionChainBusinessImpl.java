package com.pk.investing.server.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.investing.server.business.DeltaOptionChainBusiness;
import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.model.DeltaOptionChainDataModel;
import com.pk.investing.server.repository.DeltaOptionChainDataRepository;

@Service
public class DeltaOptionChainBusinessImpl implements DeltaOptionChainBusiness{

	@Autowired
	private DeltaOptionChainDataRepository deltaOptionChainDataRepository;
	
	@Override
	public DeltaOptionChainDataModel fetchDeltaOptionChainData() {
		return null;
	}

	@Override
	public List<DeltaOptionChainData> saveDeltaOptionChainData(List<DeltaOptionChainData> deltaOptionChainDataList) {
		deltaOptionChainDataRepository.saveAll(deltaOptionChainDataList);
		return null;
	}

}
