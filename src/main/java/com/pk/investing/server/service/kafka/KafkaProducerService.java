//package com.pk.investing.server.service.kafka;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//import com.pk.investing.server.model.DeltaOptionChainDataModel;
//import com.pk.investing.server.model.OptionDataModel;
//
//@Service
//public class KafkaProducerService {
//
//	private final static String KAFKA_TOPIC = "kafka_topic";
//
//	@Autowired
//	private KafkaTemplate<String, List<OptionDataModel>> kafkaTemplate;
//
//	public void sendMessage(List<OptionDataModel> modelList) {
//		kafkaTemplate.send(KAFKA_TOPIC, modelList);
//		System.out.println("Message sent modelList: " + modelList);
//	}
//}