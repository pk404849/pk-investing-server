package com.pk.investing.server.model;

public class DeltaOptionChainDataPriceBandModel {

	private String lower_limit;
	private String upper_limit;

	public String getLower_limit() {
		return lower_limit;
	}

	public void setLower_limit(String lower_limit) {
		this.lower_limit = lower_limit;
	}

	public String getUpper_limit() {
		return upper_limit;
	}

	public void setUpper_limit(String upper_limit) {
		this.upper_limit = upper_limit;
	}

}
