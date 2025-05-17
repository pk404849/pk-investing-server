package com.pk.investing.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.investing.server.business.DeltaOptionChainBusiness;
import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.model.DeltaOptionChainDataModel;
import com.pk.investing.server.service.DeltaOptionChainService;

@Service
public class DeltaOptionChainServiceImpl implements DeltaOptionChainService {

	@Autowired
	private DeltaOptionChainBusiness deltaOptionChainBusiness;
	
	@Override
	public DeltaOptionChainDataModel fetchDeltaOptionChainData() {

		return null;
	}

	@Override
	public List<DeltaOptionChainData> saveDeltaOptionChainData(List<DeltaOptionChainData> deltaOptionChainDataList) {
		return deltaOptionChainBusiness.saveDeltaOptionChainData(deltaOptionChainDataList);
	}

}
