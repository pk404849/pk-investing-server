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
@Table(name = "DELTA_OPTION_CHAIN_DATA_QUOTES")
public class DeltaOptionChainDataQuotes {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "ASK_IV")
	private String ask_iv;
	@Column(name = "ASK_SIZE")
	private String ask_size;
	@Column(name = "BEST_ASK")
	private String best_ask;
	@Column(name = "BEST_BID")
	private String best_bid;
	@Column(name = "BID_IV")
	private String bid_iv;
	@Column(name = "BID_SIZE")
	private String bid_size;
	@Column(name = "IMACT_MID_PRICE")
	private String impact_mid_price;
	@Column(name = "MARK_IV")
	private String mark_iv;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "delta_option_chain_data_id")
	private DeltaOptionChainData deltaOptionChainData;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAsk_iv() {
		return ask_iv;
	}

	public void setAsk_iv(String ask_iv) {
		this.ask_iv = ask_iv;
	}

	public String getAsk_size() {
		return ask_size;
	}

	public void setAsk_size(String ask_size) {
		this.ask_size = ask_size;
	}

	public String getBest_ask() {
		return best_ask;
	}

	public void setBest_ask(String best_ask) {
		this.best_ask = best_ask;
	}

	public String getBest_bid() {
		return best_bid;
	}

	public void setBest_bid(String best_bid) {
		this.best_bid = best_bid;
	}

	public String getBid_iv() {
		return bid_iv;
	}

	public void setBid_iv(String bid_iv) {
		this.bid_iv = bid_iv;
	}

	public String getBid_size() {
		return bid_size;
	}

	public void setBid_size(String bid_size) {
		this.bid_size = bid_size;
	}

	public String getImpact_mid_price() {
		return impact_mid_price;
	}

	public void setImpact_mid_price(String impact_mid_price) {
		this.impact_mid_price = impact_mid_price;
	}

	public String getMark_iv() {
		return mark_iv;
	}

	public void setMark_iv(String mark_iv) {
		this.mark_iv = mark_iv;
	}

	public DeltaOptionChainData getDeltaOptionChainData() {
		return deltaOptionChainData;
	}

	public void setDeltaOptionChainData(DeltaOptionChainData deltaOptionChainData) {
		this.deltaOptionChainData = deltaOptionChainData;
	}

}
