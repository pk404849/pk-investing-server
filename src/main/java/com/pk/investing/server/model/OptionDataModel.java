package com.pk.investing.server.model;

public class OptionDataModel {

	private DeltaOptionChainDataModel callData;
	private DeltaOptionChainDataModel putData;
	private String strikePrice;
	
	public DeltaOptionChainDataModel getCallData() {
		return callData;
	}
	public void setCallData(DeltaOptionChainDataModel callData) {
		this.callData = callData;
	}
	public DeltaOptionChainDataModel getPutData() {
		return putData;
	}
	public void setPutData(DeltaOptionChainDataModel putData) {
		this.putData = putData;
	}
	public String getStrikePrice() {
		return strikePrice;
	}
	public void setStrikePrice(String strikePrice) {
		this.strikePrice = strikePrice;
	}
	
	
}
