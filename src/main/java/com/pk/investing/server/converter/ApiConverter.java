package com.pk.investing.server.converter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//import com.pk.investing.server.entity.DeltaOptionChainData;
//import com.pk.investing.server.entity.DeltaOptionChainDataGreeks;
//import com.pk.investing.server.entity.DeltaOptionChainDataPriceBand;
//import com.pk.investing.server.entity.DeltaOptionChainDataQuotes;
import com.pk.investing.server.model.DeltaOptionChainDataGreeksModel;
import com.pk.investing.server.model.DeltaOptionChainDataModel;
import com.pk.investing.server.model.DeltaOptionChainDataPriceBandModel;
import com.pk.investing.server.model.DeltaOptionChainDataQuotesModel;
import com.pk.investing.server.model.OptionDataModel;
import com.pk.investing.server.util.DeltaOptionChainUtil;

public class ApiConverter {

//	public static List<DeltaOptionChainData> getDeltaOptionChainDataJpaListObject(
//			List<DeltaOptionChainDataModel> deltaOptionChainDataModelList) {
//		List<DeltaOptionChainData> deltaOptionChainDataList = null;
//		if (deltaOptionChainDataModelList != null && !deltaOptionChainDataModelList.isEmpty()) {
//			deltaOptionChainDataList = new ArrayList<DeltaOptionChainData>();
//			for (DeltaOptionChainDataModel deltaOptionChainDataModel : deltaOptionChainDataModelList) {
//				DeltaOptionChainData deltaOptionChainData = getDeltaOptionChainDataJpaObject(deltaOptionChainDataModel);
//				deltaOptionChainDataList.add(deltaOptionChainData);
//			}
//		}
//		return deltaOptionChainDataList;
//	}

//	public static DeltaOptionChainData getDeltaOptionChainDataJpaObject(DeltaOptionChainDataModel dataModel) {
//		DeltaOptionChainData data = new DeltaOptionChainData();
//		data.setClose(dataModel.getClose());
//		data.setContract_type(dataModel.getContract_type());
//		data.setDescription(dataModel.getDescription());
//		data.setHigh(dataModel.getHigh());
//		data.setInitial_margin(dataModel.getInitial_margin());
//		data.setLow(dataModel.getLow());
//		data.setMark_change_24h(dataModel.getMark_change_24h());
//		data.setMark_price(dataModel.getMark_price());
//		data.setMark_vol(dataModel.getMark_vol());
//		data.setOi(dataModel.getOi());
//		data.setOi_change_usd_6h(dataModel.getOi_change_usd_6h());
//		data.setOi_contracts(dataModel.getOi_contracts());
//		data.setOi_value(dataModel.getOi_value());
//		data.setOi_value_symbol(dataModel.getOi_value_symbol());
//		data.setOi_value_usd(dataModel.getOi_value_usd());
//		data.setOpen(dataModel.getOpen());
//		data.setProduct_id(dataModel.getProduct_id());
//		data.setSize(dataModel.getSize());
//		data.setSpot_price(dataModel.getSpot_price());
//		data.setStrike_price(dataModel.getStrike_price());
//		data.setSymbol(dataModel.getSymbol());
//		data.setTick_size(dataModel.getTick_size());
//		// Timestamp timestamp = dataModel.getTimestamp();
////		LocalDateTime localDateTime =
////			      LocalDateTime.ofInstant(timestamp, ZoneId.of("UTC"));
////		data.setTimestamp(dataModel.getTimestamp());
//		data.setTurnover(dataModel.getTurnover());
//		data.setTurnover_symbol(dataModel.getTurnover_symbol());
//		data.setTurnover_usd(dataModel.getTurnover_usd());
//		data.setUnderlying_asset_symbol(dataModel.getUnderlying_asset_symbol());
//		data.setVolume(dataModel.getVolume());
//		String dateTimeToString = DeltaOptionChainUtil.localDateTimeToString();
//		LocalDateTime strToDateTime = DeltaOptionChainUtil.strToDateTime(dateTimeToString);
//		data.setCreatedTime(strToDateTime);
//		DeltaOptionChainDataGreeksModel deltaOptionChainDataGreeksModel = dataModel.getGreeks();
//		if (deltaOptionChainDataGreeksModel != null) {
//			DeltaOptionChainDataGreeks deltaOptionChainDataGreeks = getDeltaOptionChainDataGreeksJpaObject(
//					deltaOptionChainDataGreeksModel);
//			data.addDeltaOptionChainDataGreeksList(deltaOptionChainDataGreeks);
//		}
//		DeltaOptionChainDataPriceBandModel priceBandModel = dataModel.getPrice_band();
//		if (priceBandModel != null) {
//			DeltaOptionChainDataPriceBand priceBand = getDeltaOptionChainDataPriceBandJpaObject(priceBandModel);
//			data.addDeltaOptionChainDataPriceBandList(priceBand);
//		}
//		DeltaOptionChainDataQuotesModel dataQuotesModel = dataModel.getQuotes();
//		if (dataQuotesModel != null) {
//			DeltaOptionChainDataQuotes dataQuotes = getDeltaOptionChainDataQuotesJpaObject(dataQuotesModel);
//			data.addDeltaOptionChainDataQuotesList(dataQuotes);
//		}
//		return data;
//	}

//	public static DeltaOptionChainDataGreeks getDeltaOptionChainDataGreeksJpaObject(
//			DeltaOptionChainDataGreeksModel greeksModel) {
//		DeltaOptionChainDataGreeks greeks = new DeltaOptionChainDataGreeks();
//		greeks.setDelta(greeksModel.getDelta());
//		greeks.setGamma(greeksModel.getGamma());
//		greeks.setRho(greeksModel.getRho());
//		greeks.setSpot(greeksModel.getSpot());
//		greeks.setTheta(greeksModel.getTheta());
//		greeks.setVega(greeksModel.getVega());
//		return greeks;
//	}

//	public static DeltaOptionChainDataPriceBand getDeltaOptionChainDataPriceBandJpaObject(
//			DeltaOptionChainDataPriceBandModel priceBandModel) {
//		DeltaOptionChainDataPriceBand priceBand = new DeltaOptionChainDataPriceBand();
//		priceBand.setLower_limit(priceBandModel.getLower_limit());
//		priceBand.setUpper_limit(priceBandModel.getUpper_limit());
//		return priceBand;
//	}

//	public static DeltaOptionChainDataQuotes getDeltaOptionChainDataQuotesJpaObject(
//			DeltaOptionChainDataQuotesModel dataQuotesModel) {
//		DeltaOptionChainDataQuotes dataQuotes = new DeltaOptionChainDataQuotes();
//		dataQuotes.setAsk_iv(dataQuotesModel.getAsk_iv());
//		dataQuotes.setAsk_size(dataQuotesModel.getAsk_size());
//		dataQuotes.setBest_ask(dataQuotesModel.getBest_ask());
//		dataQuotes.setBest_bid(dataQuotesModel.getBest_bid());
//		dataQuotes.setBid_iv(dataQuotesModel.getBid_iv());
//		dataQuotes.setBid_size(dataQuotesModel.getBid_size());
//		dataQuotes.setImpact_mid_price(dataQuotesModel.getImpact_mid_price());
//		dataQuotes.setMark_iv(dataQuotesModel.getMark_iv());
//		return dataQuotes;
//	}

//	public static List<DeltaOptionChainDataModel> getDeltaOptionChainDataModelListObject(
//			List<DeltaOptionChainData> dataList) {
//		List<DeltaOptionChainDataModel> dataModelList = null;
//		if (dataList != null && !dataList.isEmpty()) {
//			dataModelList = new ArrayList<DeltaOptionChainDataModel>();
//			for (DeltaOptionChainData data : dataList) {
//				dataModelList.add(getDeltaOptionChainDataModelListObject(data));
//			}
//		}
//		return dataModelList;
//	}

//	public static DeltaOptionChainDataModel getDeltaOptionChainDataModelListObject(DeltaOptionChainData data) {
//		DeltaOptionChainDataModel dataModel = null;
//		if (data != null) {
//			dataModel = new DeltaOptionChainDataModel();
//
//			dataModel.setClose(data.getClose());
//			dataModel.setContract_type(data.getContract_type());
//			dataModel.setDescription(data.getDescription());
//			dataModel.setHigh(data.getHigh());
//			dataModel.setInitial_margin(data.getInitial_margin());
//			dataModel.setLow(data.getLow());
//			dataModel.setMark_change_24h(data.getMark_change_24h());
//			dataModel.setMark_price(data.getMark_price());
//			dataModel.setMark_vol(data.getMark_vol());
//			dataModel.setOi(data.getOi());
//			dataModel.setOi_change_usd_6h(data.getOi_change_usd_6h());
//			dataModel.setOi_contracts(data.getOi_contracts());
//			dataModel.setOi_value(data.getOi_value());
//			dataModel.setOi_value_symbol(data.getOi_value_symbol());
//			dataModel.setOi_value_usd(data.getOi_value_usd());
//			dataModel.setOpen(data.getOpen());
//			dataModel.setProduct_id(data.getProduct_id());
//			dataModel.setSize(data.getSize());
//			dataModel.setSpot_price(data.getSpot_price());
//			dataModel.setStrike_price(data.getStrike_price());
//			dataModel.setSymbol(data.getSymbol());
//			dataModel.setTick_size(data.getTick_size());
//			// Timestamp timestamp = dataModel.getTimestamp();
////			LocalDateTime localDateTime =
////				      LocalDateTime.ofInstant(timestamp, ZoneId.of("UTC"));
////			data.setTimestamp(dataModel.getTimestamp());
//			dataModel.setTurnover(data.getTurnover());
//			dataModel.setTurnover_symbol(data.getTurnover_symbol());
//			dataModel.setTurnover_usd(data.getTurnover_usd());
//			dataModel.setUnderlying_asset_symbol(data.getUnderlying_asset_symbol());
//			dataModel.setVolume(data.getVolume());
//			dataModel.setCreatedTime(data.getCreatedTime());
//
//			List<DeltaOptionChainDataGreeks> deltaOptionChainDataGreeksList = data.getDeltaOptionChainDataGreeksList();
//			if (deltaOptionChainDataGreeksList != null && !deltaOptionChainDataGreeksList.isEmpty()) {
//				DeltaOptionChainDataGreeksModel deltaOptionChainDataGreeks = getDeltaOptionChainDataGreeksModelObject(
//						deltaOptionChainDataGreeksList.get(0));
//				dataModel.setGreeks(deltaOptionChainDataGreeks);
//			}
//
//			List<DeltaOptionChainDataPriceBand> priceBandList = data.getDeltaOptionChainDataPriceBandList();
//			if (priceBandList != null && !priceBandList.isEmpty()) {
//				DeltaOptionChainDataPriceBandModel priceBandModel = getDeltaOptionChainDataPriceBandModelObject(
//						priceBandList.get(0));
//				dataModel.setPrice_band(priceBandModel);
//			}
//			List<DeltaOptionChainDataQuotes> dataQuotesList = data.getDeltaOptionChainDataQuotesList();
//			if (dataQuotesList != null && !dataQuotesList.isEmpty()) {
//				DeltaOptionChainDataQuotesModel dataQuotesModel = getDeltaOptionChainDataQuotesModelObject(
//						dataQuotesList.get(0));
//				dataModel.setQuotes(dataQuotesModel);
//			}
//		}
//		return dataModel;
//	}

//	public static DeltaOptionChainDataGreeksModel getDeltaOptionChainDataGreeksModelObject(
//			DeltaOptionChainDataGreeks greeksData) {
//		DeltaOptionChainDataGreeksModel greeksModel = new DeltaOptionChainDataGreeksModel();
//		greeksModel.setDelta(greeksData.getDelta());
//		greeksModel.setGamma(greeksData.getGamma());
//		greeksModel.setRho(greeksData.getRho());
//		greeksModel.setSpot(greeksData.getSpot());
//		greeksModel.setTheta(greeksData.getTheta());
//		greeksModel.setVega(greeksData.getVega());
//		return greeksModel;
//	}

//	public static DeltaOptionChainDataPriceBandModel getDeltaOptionChainDataPriceBandModelObject(
//			DeltaOptionChainDataPriceBand priceBand) {
//		DeltaOptionChainDataPriceBandModel priceBandModel = new DeltaOptionChainDataPriceBandModel();
//		priceBandModel.setLower_limit(priceBand.getLower_limit());
//		priceBandModel.setUpper_limit(priceBand.getUpper_limit());
//		return priceBandModel;
//	}

//	public static DeltaOptionChainDataQuotesModel getDeltaOptionChainDataQuotesModelObject(
//			DeltaOptionChainDataQuotes dataQuotes) {
//		DeltaOptionChainDataQuotesModel dataQuotesModel = new DeltaOptionChainDataQuotesModel();
//		dataQuotesModel.setAsk_iv(dataQuotes.getAsk_iv());
//		dataQuotesModel.setAsk_size(dataQuotes.getAsk_size());
//		dataQuotesModel.setBest_ask(dataQuotes.getBest_ask());
//		dataQuotesModel.setBest_bid(dataQuotes.getBest_bid());
//		dataQuotesModel.setBid_iv(dataQuotes.getBid_iv());
//		dataQuotesModel.setBid_size(dataQuotes.getBid_size());
//		dataQuotesModel.setImpact_mid_price(dataQuotes.getImpact_mid_price());
//		dataQuotesModel.setMark_iv(dataQuotes.getMark_iv());
//		return dataQuotesModel;
//	}
	
	public static List<OptionDataModel> getOptionDataModelList (List<DeltaOptionChainDataModel> dataModelList) {
		if(dataModelList != null && !dataModelList.isEmpty()) {
			Map<String, List<DeltaOptionChainDataModel>> dataMap = dataModelList.stream()
					.collect(Collectors.groupingBy(s -> s.getStrike_price()));
			List<OptionDataModel> optionDataModelList = new ArrayList<OptionDataModel>();
			for (Map.Entry<String, List<DeltaOptionChainDataModel>> map : dataMap.entrySet()) {
				List<DeltaOptionChainDataModel> value = map.getValue();
				String key = map.getKey();
				OptionDataModel optionDataModel = getOptionDataModelObject(key, value);
				if(optionDataModel != null) {
					optionDataModelList.add(optionDataModel);
				}
			}
			List<OptionDataModel> sortedModelList = optionDataModelList.stream()
					.sorted(Comparator.comparing(OptionDataModel::getStrikePrice)).collect(Collectors.toList());
			return sortedModelList;
		}
		return  null;
	}
	
	public static OptionDataModel getOptionDataModelObject(String key, List<DeltaOptionChainDataModel> valueList) {
		if(valueList != null && !valueList.isEmpty()) {
			OptionDataModel optionDataModel = new OptionDataModel();
			for (DeltaOptionChainDataModel data : valueList) {
				if (key.equalsIgnoreCase(data.getStrike_price())) {
					optionDataModel.setCurrency(data.getOi_value_symbol());
					if (data.getDescription().contains("Put")) {
						data.setQuotes(roundCalcualtionIv(data.getQuotes()));
						data.setGreeks(roundCalcualtionGreeks(data.getGreeks()));
						data.setOi_value_usd(roundCalcualtionOI(data.getOi_value_usd()));
						optionDataModel.setPutData(data);
					} else if (data.getDescription().contains("Call")) {
						data.setQuotes(roundCalcualtionIv(data.getQuotes()));
						data.setGreeks(roundCalcualtionGreeks(data.getGreeks()));
						data.setOi_value_usd(roundCalcualtionOI(data.getOi_value_usd()));
						optionDataModel.setCallData(data);
					}
					optionDataModel.setStrikePrice(key);
				}
			}
			return optionDataModel;
		}
		return null;
	}
	private static String roundCalcualtionOI(String getOi_value_usd) {
		return getOi_value_usd.split("\\.")[0];
		 
	}
	private static DeltaOptionChainDataQuotesModel roundCalcualtionIv(DeltaOptionChainDataQuotesModel quotesModel) {
		quotesModel.setMark_iv(quotesModel.getMark_iv().substring(2, 4));
		return quotesModel;
	}

	private static DeltaOptionChainDataGreeksModel roundCalcualtionGreeks(DeltaOptionChainDataGreeksModel greeksDataModel) {
		if(greeksDataModel.getDelta().contains("-")) {
			greeksDataModel.setDelta(greeksDataModel.getDelta().substring(0,5));
		}else {
			greeksDataModel.setDelta(greeksDataModel.getDelta().substring(0,4));
		}
		
		if(greeksDataModel.getTheta().contains("-")) {
			greeksDataModel.setTheta(greeksDataModel.getTheta().substring(0,5));
		}else {
			greeksDataModel.setTheta(greeksDataModel.getTheta().substring(0,4));
		}
		
		if(greeksDataModel.getGamma().contains("-")) {
			greeksDataModel.setGamma(greeksDataModel.getGamma().substring(0,5));
		}else {
			greeksDataModel.setGamma(greeksDataModel.getGamma().substring(0,4));
		}
		
		if(greeksDataModel.getVega().contains("-")) {
			greeksDataModel.setVega(greeksDataModel.getVega().substring(0,5));
		}else {
			greeksDataModel.setVega(greeksDataModel.getVega().substring(0,4));
		}
		return greeksDataModel;
	}
}
