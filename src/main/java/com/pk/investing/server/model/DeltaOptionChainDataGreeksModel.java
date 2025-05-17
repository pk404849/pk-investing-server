package com.pk.investing.server.model;

public class DeltaOptionChainDataGreeksModel {

	private String delta;
	private String gamma;
	private String rho;
	private String spot;
	private String theta;
	private String vega;

	public String getDelta() {
		return delta;
	}

	public void setDelta(String delta) {
		this.delta = delta;
	}

	public String getGamma() {
		return gamma;
	}

	public void setGamma(String gamma) {
		this.gamma = gamma;
	}

	public String getRho() {
		return rho;
	}

	public void setRho(String rho) {
		this.rho = rho;
	}

	public String getSpot() {
		return spot;
	}

	public void setSpot(String spot) {
		this.spot = spot;
	}

	public String getTheta() {
		return theta;
	}

	public void setTheta(String theta) {
		this.theta = theta;
	}

	public String getVega() {
		return vega;
	}

	public void setVega(String vega) {
		this.vega = vega;
	}

}
