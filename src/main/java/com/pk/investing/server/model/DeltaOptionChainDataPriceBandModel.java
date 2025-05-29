package com.pk.investing.server.model;

import java.io.Serializable;

public class DeltaOptionChainDataPriceBandModel implements Serializable{

	private static final long serialVersionUID = 6739056367870459824L;
	
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

	@Override
	public String toString() {
		return "DeltaOptionChainDataPriceBandModel [lower_limit=" + lower_limit + ", upper_limit=" + upper_limit + "]";
	}
}
