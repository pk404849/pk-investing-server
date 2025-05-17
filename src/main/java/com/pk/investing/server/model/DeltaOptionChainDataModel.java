package com.pk.investing.server.model;

import java.sql.Date;

public class DeltaOptionChainDataModel {

	private Double close;
	private String contract_type;
	private String description;
	private Double high;
	private String initial_margin;
	private Double low;
	private String mark_change_24h;
	private String mark_price;
	private String mark_vol;
	private String oi;
	private String oi_change_usd_6h;
	private String oi_contracts;
	private String oi_value;
	private String oi_value_symbol;
	private String oi_value_usd;
	private Double open;
	private Integer product_id;
	private Integer size;
	private String spot_price;
	private String strike_price;
	private String symbol;
	// "tags": [],
	private String tick_size;
	private Date timestamp;
	private Double turnover;
	private String turnover_symbol;
	private Double turnover_usd;
	private String underlying_asset_symbol;
	private Double volume;

	private DeltaOptionChainDataGreeksModel greeks;
	private DeltaOptionChainDataPriceBandModel price_band;
	private DeltaOptionChainDataQuotesModel quotes;

	public Double getClose() {
		return close;
	}

	public void setClose(Double close) {
		this.close = close;
	}

	public String getContract_type() {
		return contract_type;
	}

	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getHigh() {
		return high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public String getInitial_margin() {
		return initial_margin;
	}

	public void setInitial_margin(String initial_margin) {
		this.initial_margin = initial_margin;
	}

	public Double getLow() {
		return low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public String getMark_change_24h() {
		return mark_change_24h;
	}

	public void setMark_change_24h(String mark_change_24h) {
		this.mark_change_24h = mark_change_24h;
	}

	public String getMark_price() {
		return mark_price;
	}

	public void setMark_price(String mark_price) {
		this.mark_price = mark_price;
	}

	public String getMark_vol() {
		return mark_vol;
	}

	public void setMark_vol(String mark_vol) {
		this.mark_vol = mark_vol;
	}

	public String getOi() {
		return oi;
	}

	public void setOi(String oi) {
		this.oi = oi;
	}

	public String getOi_change_usd_6h() {
		return oi_change_usd_6h;
	}

	public void setOi_change_usd_6h(String oi_change_usd_6h) {
		this.oi_change_usd_6h = oi_change_usd_6h;
	}

	public String getOi_contracts() {
		return oi_contracts;
	}

	public void setOi_contracts(String oi_contracts) {
		this.oi_contracts = oi_contracts;
	}

	public String getOi_value() {
		return oi_value;
	}

	public void setOi_value(String oi_value) {
		this.oi_value = oi_value;
	}

	public String getOi_value_symbol() {
		return oi_value_symbol;
	}

	public void setOi_value_symbol(String oi_value_symbol) {
		this.oi_value_symbol = oi_value_symbol;
	}

	public String getOi_value_usd() {
		return oi_value_usd;
	}

	public void setOi_value_usd(String oi_value_usd) {
		this.oi_value_usd = oi_value_usd;
	}

	public Double getOpen() {
		return open;
	}

	public void setOpen(Double open) {
		this.open = open;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getSpot_price() {
		return spot_price;
	}

	public void setSpot_price(String spot_price) {
		this.spot_price = spot_price;
	}

	public String getStrike_price() {
		return strike_price;
	}

	public void setStrike_price(String strike_price) {
		this.strike_price = strike_price;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getTick_size() {
		return tick_size;
	}

	public void setTick_size(String tick_size) {
		this.tick_size = tick_size;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Double getTurnover() {
		return turnover;
	}

	public void setTurnover(Double turnover) {
		this.turnover = turnover;
	}

	public String getTurnover_symbol() {
		return turnover_symbol;
	}

	public void setTurnover_symbol(String turnover_symbol) {
		this.turnover_symbol = turnover_symbol;
	}

	public Double getTurnover_usd() {
		return turnover_usd;
	}

	public void setTurnover_usd(Double turnover_usd) {
		this.turnover_usd = turnover_usd;
	}

	public String getUnderlying_asset_symbol() {
		return underlying_asset_symbol;
	}

	public void setUnderlying_asset_symbol(String underlying_asset_symbol) {
		this.underlying_asset_symbol = underlying_asset_symbol;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public DeltaOptionChainDataGreeksModel getGreeks() {
		return greeks;
	}

	public void setGreeks(DeltaOptionChainDataGreeksModel greeks) {
		this.greeks = greeks;
	}

	public DeltaOptionChainDataPriceBandModel getPrice_band() {
		return price_band;
	}

	public void setPrice_band(DeltaOptionChainDataPriceBandModel price_band) {
		this.price_band = price_band;
	}

	public DeltaOptionChainDataQuotesModel getQuotes() {
		return quotes;
	}

	public void setQuotes(DeltaOptionChainDataQuotesModel quotes) {
		this.quotes = quotes;
	}

}
