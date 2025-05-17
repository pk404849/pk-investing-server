package com.pk.investing.server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DELTA_OPTION_CHAIN_DATA_GREEKS")
public class DeltaOptionChainDataGreeks {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "DELTA")
	private String delta;
	@Column(name = "GAMMA")
	private String gamma;
	@Column(name = "RHO")
	private String rho;
	@Column(name = "SPOT")
	private String spot;
	@Column(name = "THETA")
	private String theta;
	@Column(name = "VEGA")
	private String vega;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "delta_option_chain_data_id")
	private DeltaOptionChainData deltaOptionChainData;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public DeltaOptionChainData getDeltaOptionChainData() {
		return deltaOptionChainData;
	}

	public void setDeltaOptionChainData(DeltaOptionChainData deltaOptionChainData) {
		this.deltaOptionChainData = deltaOptionChainData;
	}

}
