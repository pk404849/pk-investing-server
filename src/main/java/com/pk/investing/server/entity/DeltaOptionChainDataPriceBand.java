package com.pk.investing.server.entity;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "DELTA_OPTION_CHAIN_DATA_PRICE_BAND")
//public class DeltaOptionChainDataPriceBand {
//
//	@Id
//	@Column(name = "ID")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	@Column(name = "LOWER_LIMIT")
//	private String lower_limit;
//	@Column(name = "UPPER_LIMIT")
//	private String upper_limit;
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "delta_option_chain_data_id")
//	private DeltaOptionChainData deltaOptionChainData;
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getLower_limit() {
//		return lower_limit;
//	}
//
//	public void setLower_limit(String lower_limit) {
//		this.lower_limit = lower_limit;
//	}
//
//	public String getUpper_limit() {
//		return upper_limit;
//	}
//
//	public void setUpper_limit(String upper_limit) {
//		this.upper_limit = upper_limit;
//	}
//
//	public DeltaOptionChainData getDeltaOptionChainData() {
//		return deltaOptionChainData;
//	}
//
//	public void setDeltaOptionChainData(DeltaOptionChainData deltaOptionChainData) {
//		this.deltaOptionChainData = deltaOptionChainData;
//	}
//
//}
