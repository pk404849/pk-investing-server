package com.pk.investing.server.controller.rest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pk.investing.server.controller.BaseController;
import com.pk.investing.server.controller.ResponseMessage;
import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.model.DeltaOptionChainDataModel;
import com.pk.investing.server.service.DeltaOptionChainService;
import com.pk.investing.server.util.Util;

@RestController
@RequestMapping(value = "/delta-option-chain")
public class DeltaOptionChainController extends BaseController{
	
	@Autowired
	private DeltaOptionChainService deltaOptionChainService;
	
	@GetMapping(value = "/fetch-delta-option-chain-data")
	public ResponseEntity<?> fetchDeltaOptionChainData(@RequestParam("strDateTime") String strDateTime){
		LocalDateTime strToDateTime = Util.strToDateTime(strDateTime);
		Map<String, List<DeltaOptionChainDataModel>> dataModelMap= deltaOptionChainService.fetchDeltaOptionChainData(strToDateTime);
		ResponseMessage response = new ResponseMessage();
		response.setData(dataModelMap);
		response.setStatus(true);
		return sendResponse(response);
	}
}
