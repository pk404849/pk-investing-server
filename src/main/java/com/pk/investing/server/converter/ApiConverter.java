package com.pk.investing.server.converter;

import java.util.ArrayList;
import java.util.List;

import com.pk.investing.server.entity.DeltaOptionChainData;
import com.pk.investing.server.entity.DeltaOptionChainDataGreeks;
import com.pk.investing.server.entity.DeltaOptionChainDataPriceBand;
import com.pk.investing.server.entity.DeltaOptionChainDataQuotes;
import com.pk.investing.server.model.DeltaOptionChainDataGreeksModel;
import com.pk.investing.server.model.DeltaOptionChainDataModel;
import com.pk.investing.server.model.DeltaOptionChainDataPriceBandModel;
import com.pk.investing.server.model.DeltaOptionChainDataQuotesModel;

public class ApiConverter {

	public static List<DeltaOptionChainData> getDeltaOptionChainDataJpaListObject(
			List<DeltaOptionChainDataModel> deltaOptionChainDataModelList) {
		List<DeltaOptionChainData> deltaOptionChainDataList = null;
		if (deltaOptionChainDataModelList != null && !deltaOptionChainDataModelList.isEmpty()) {
			deltaOptionChainDataList = new ArrayList<DeltaOptionChainData>();
			for (DeltaOptionChainDataModel deltaOptionChainDataModel : deltaOptionChainDataModelList) {
				DeltaOptionChainData deltaOptionChainData = getDeltaOptionChainDataJpaObject(deltaOptionChainDataModel);
				deltaOptionChainDataList.add(deltaOptionChainData);
			}
		}
		return deltaOptionChainDataList;
	}

	public static DeltaOptionChainData getDeltaOptionChainDataJpaObject(DeltaOptionChainDataModel dataModel) {
		DeltaOptionChainData data = new DeltaOptionChainData();
		data.setClose(dataModel.getClose());
		data.setContract_type(dataModel.getContract_type());
		data.setDescription(dataModel.getDescription());
		data.setHigh(dataModel.getHigh());
		data.setInitial_margin(dataModel.getInitial_margin());
		data.setLow(dataModel.getLow());
		data.setMark_change_24h(dataModel.getMark_change_24h());
		data.setMark_price(dataModel.getMark_price());
		data.setMark_vol(dataModel.getMark_vol());
		data.setOi(dataModel.getOi());
		data.setOi_change_usd_6h(dataModel.getOi_change_usd_6h());
		data.setOi_contracts(dataModel.getOi_contracts());
		data.setOi_value(dataModel.getOi_value());
		data.setOi_value_symbol(dataModel.getOi_value_symbol());
		data.setOi_value_usd(dataModel.getOi_value_usd());
		data.setOpen(dataModel.getOpen());
		data.setProduct_id(dataModel.getProduct_id());
		data.setSize(dataModel.getSize());
		data.setSpot_price(dataModel.getSpot_price());
		data.setStrike_price(dataModel.getStrike_price());
		data.setSymbol(dataModel.getSymbol());
		data.setTick_size(dataModel.getTick_size());
		//Timestamp timestamp = dataModel.getTimestamp();
//		LocalDateTime localDateTime =
//			      LocalDateTime.ofInstant(timestamp, ZoneId.of("UTC"));
//		data.setTimestamp(dataModel.getTimestamp());
		data.setTurnover(dataModel.getTurnover());
		data.setTurnover_symbol(dataModel.getTurnover_symbol());
		data.setTurnover_usd(dataModel.getTurnover_usd());
		data.setUnderlying_asset_symbol(dataModel.getUnderlying_asset_symbol());
		data.setVolume(dataModel.getVolume());
		DeltaOptionChainDataGreeksModel deltaOptionChainDataGreeksModel = dataModel.getGreeks();
		if (deltaOptionChainDataGreeksModel != null) {
			DeltaOptionChainDataGreeks deltaOptionChainDataGreeks = getDeltaOptionChainDataGreeksJpaObject(
					deltaOptionChainDataGreeksModel);
			data.addDeltaOptionChainDataGreeksList(deltaOptionChainDataGreeks);
		}
		DeltaOptionChainDataPriceBandModel priceBandModel = dataModel.getPrice_band();
		if (priceBandModel != null) {
			DeltaOptionChainDataPriceBand priceBand = getDeltaOptionChainDataPriceBandJpaObject(priceBandModel);
			data.addDeltaOptionChainDataPriceBandList(priceBand);
		}
		DeltaOptionChainDataQuotesModel dataQuotesModel = dataModel.getQuotes();
		if (dataQuotesModel != null) {
			DeltaOptionChainDataQuotes dataQuotes = getDeltaOptionChainDataQuotesJpaObject(dataQuotesModel);
			data.addDeltaOptionChainDataQuotesList(dataQuotes);
		}
		return data;
	}

	public static DeltaOptionChainDataGreeks getDeltaOptionChainDataGreeksJpaObject(
			DeltaOptionChainDataGreeksModel greeksModel) {
		DeltaOptionChainDataGreeks greeks = new DeltaOptionChainDataGreeks();
		greeks.setDelta(greeksModel.getDelta());
		greeks.setGamma(greeksModel.getGamma());
		greeks.setRho(greeksModel.getRho());
		greeks.setSpot(greeksModel.getSpot());
		greeks.setTheta(greeksModel.getTheta());
		greeks.setVega(greeksModel.getVega());
		return greeks;
	}

	public static DeltaOptionChainDataPriceBand getDeltaOptionChainDataPriceBandJpaObject(
			DeltaOptionChainDataPriceBandModel priceBandModel) {
		DeltaOptionChainDataPriceBand priceBand = new DeltaOptionChainDataPriceBand();
		priceBand.setLower_limit(priceBandModel.getLower_limit());
		priceBand.setUpper_limit(priceBandModel.getUpper_limit());
		return priceBand;
	}

	public static DeltaOptionChainDataQuotes getDeltaOptionChainDataQuotesJpaObject(
			DeltaOptionChainDataQuotesModel dataQuotesModel) {
		DeltaOptionChainDataQuotes dataQuotes = new DeltaOptionChainDataQuotes();
		dataQuotes.setAsk_iv(dataQuotesModel.getAsk_iv());
		dataQuotes.setAsk_size(dataQuotesModel.getAsk_size());
		dataQuotes.setBest_ask(dataQuotesModel.getBest_ask());
		dataQuotes.setBest_bid(dataQuotesModel.getBest_bid());
		dataQuotes.setBid_iv(dataQuotesModel.getBid_iv());
		dataQuotes.setBid_size(dataQuotesModel.getBid_size());
		dataQuotes.setImpact_mid_price(dataQuotesModel.getImpact_mid_price());
		dataQuotes.setMark_iv(dataQuotesModel.getMark_iv());
		return dataQuotes;
	}
}
