package com.pk.investing.server.model;

public class DeltaOptionChainDataQuotesModel {

	private String ask_iv;
	private String ask_size;
	private String best_ask;
	private String best_bid;
	private String bid_iv;
	private String bid_size;
	private String impact_mid_price;
	private String mark_iv;

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

	@Override
	public String toString() {
		return "DeltaOptionChainDataQuotesModel [ask_iv=" + ask_iv + ", ask_size=" + ask_size + ", best_ask=" + best_ask
				+ ", best_bid=" + best_bid + ", bid_iv=" + bid_iv + ", bid_size=" + bid_size + ", impact_mid_price="
				+ impact_mid_price + ", mark_iv=" + mark_iv + "]";
	}

}
