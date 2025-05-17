package com.pk.investing.server.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DELTA_OPTION_CHAIN_DATA")
public class DeltaOptionChainData {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "CLOSE")
	private Double close;
	@Column(name = "CONTRACT_TYPE")
	private String contract_type;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "HIGH")
	private Double high;
	@Column(name = "INITIAL_MARIGIN")
	private String initial_margin;
	@Column(name = "LOW")
	private Double low;
	@Column(name = "MARK_CHANGE_24TH")
	private String mark_change_24h;
	@Column(name = "MARK_PRICE")
	private String mark_price;
	@Column(name = "MARK_VOL")
	private String mark_vol;
	@Column(name = "OI")
	private String oi;
	@Column(name = "OI_CHANGE_USD_6H")
	private String oi_change_usd_6h;
	@Column(name = "OI_CONTRACTS")
	private String oi_contracts;
	@Column(name = "OI_VALUE")
	private String oi_value;
	@Column(name = "OI_VALUE_SYMBOL")
	private String oi_value_symbol;
	@Column(name = "OI_VALUE_USD")
	private String oi_value_usd;
	@Column(name = "OPEN")
	private Double open;
	@Column(name = "PRODUCT_ID")
	private Integer product_id;
	@Column(name = "SIZE")
	private Integer size;
	@Column(name = "SPOT_PRICE")
	private String spot_price;
	@Column(name = "STRIKE_PRICE")
	private String strike_price;
	@Column(name = "SYMBOL")
	private String symbol;
	// "tags": [],
	@Column(name = "TICK_SIZE")
	private String tick_size;
//	@Column(name = "TIMESTAMP")
//	private LocalDateTime timestamp;
	@Column(name = "TURNOVER")
	private Double turnover;
	@Column(name = "TURNOVER_SYMBOL")
	private String turnover_symbol;
	@Column(name = "TURNOVER_USD")
	private Double turnover_usd;
	@Column(name = "UNDERLYING_ASSET_SYMBOL")
	private String underlying_asset_symbol;
	@Column(name = "VOLUME")
	private Double volume;
	@OneToMany(mappedBy = "deltaOptionChainData", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DeltaOptionChainDataGreeks> deltaOptionChainDataGreeksList;
	@OneToMany(mappedBy = "deltaOptionChainData", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DeltaOptionChainDataPriceBand> deltaOptionChainDataPriceBandList;
	@OneToMany(mappedBy = "deltaOptionChainData", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DeltaOptionChainDataQuotes> deltaOptionChainDataQuotesList;
	@Column(name = "CREATED_TIME")
	private LocalDateTime createdTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

//	public LocalDateTime getTimestamp() {
//		return timestamp;
//	}
//
//	public void setTimestamp(LocalDateTime timestamp) {
//		this.timestamp = timestamp;
//	}

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

	public List<DeltaOptionChainDataGreeks> getDeltaOptionChainDataGreeksList() {
		return deltaOptionChainDataGreeksList;
	}

	public void setDeltaOptionChainDataGreeksList(List<DeltaOptionChainDataGreeks> deltaOptionChainDataGreeksList) {
		this.deltaOptionChainDataGreeksList = deltaOptionChainDataGreeksList;
	}

	public List<DeltaOptionChainDataPriceBand> getDeltaOptionChainDataPriceBandList() {
		return deltaOptionChainDataPriceBandList;
	}

	public void setDeltaOptionChainDataPriceBandList(
			List<DeltaOptionChainDataPriceBand> deltaOptionChainDataPriceBandList) {
		this.deltaOptionChainDataPriceBandList = deltaOptionChainDataPriceBandList;
	}

	public List<DeltaOptionChainDataQuotes> getDeltaOptionChainDataQuotesList() {
		return deltaOptionChainDataQuotesList;
	}

	public void setDeltaOptionChainDataQuotesList(List<DeltaOptionChainDataQuotes> deltaOptionChainDataQuotesList) {
		this.deltaOptionChainDataQuotesList = deltaOptionChainDataQuotesList;
	}

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}

	public void addDeltaOptionChainDataGreeksList(DeltaOptionChainDataGreeks deltaOptionChainDataGreeks) {
		if (deltaOptionChainDataGreeksList == null) {
			deltaOptionChainDataGreeksList = new ArrayList<DeltaOptionChainDataGreeks>();
		}
		deltaOptionChainDataGreeks.setDeltaOptionChainData(this);
		this.deltaOptionChainDataGreeksList.add(deltaOptionChainDataGreeks);
	}

	public void addDeltaOptionChainDataPriceBandList(DeltaOptionChainDataPriceBand deltaOptionChainDataPriceBand) {
		if (deltaOptionChainDataPriceBandList == null) {
			deltaOptionChainDataPriceBandList = new ArrayList<DeltaOptionChainDataPriceBand>();
		}
		deltaOptionChainDataPriceBand.setDeltaOptionChainData(this);
		this.deltaOptionChainDataPriceBandList.add(deltaOptionChainDataPriceBand);
	}

	public void addDeltaOptionChainDataQuotesList(DeltaOptionChainDataQuotes deltaOptionChainDataQuotes) {
		if (deltaOptionChainDataQuotesList == null) {
			deltaOptionChainDataQuotesList = new ArrayList<DeltaOptionChainDataQuotes>();
		}
		deltaOptionChainDataQuotes.setDeltaOptionChainData(this);
		this.deltaOptionChainDataQuotesList.add(deltaOptionChainDataQuotes);
	}
}
