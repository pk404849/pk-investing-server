//package com.pk.investing.server.config.kafka;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.pk.investing.server.model.DeltaOptionChainDataModel;
//import com.pk.investing.server.model.OptionDataModel;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.support.serializer.JsonDeserializer;
//import org.springframework.kafka.core.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@EnableKafka
//@Configuration
//public class KafkaConsumerConfig {
//
//	@Bean
//	ConsumerFactory<String, List<OptionDataModel>> consumerFactory() {
//		JsonDeserializer<List<OptionDataModel>> deserializer =
//	            new JsonDeserializer<>();
//	        deserializer.addTrustedPackages("*");
//	        return new DefaultKafkaConsumerFactory<>(
//	                Map.of(
//	                    "bootstrap.servers", "localhost:9092",
//	                    "group.id", "kafka_group_id",
//	                    "key.deserializer", StringDeserializer.class,
//	                    "value.deserializer", JsonDeserializer.class
//	                ),
//	                new StringDeserializer(),
//	                deserializer
//	            );
////		Map<String, Object> configProps = new HashMap<>();
////		configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
////		configProps.put(ConsumerConfig.GROUP_ID_CONFIG, "kafka_group_id");
////		configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
////		configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
////		return new DefaultKafkaConsumerFactory<>(configProps);
//	}
//
//	@Bean
//	ConcurrentKafkaListenerContainerFactory<String, List<OptionDataModel>> kafkaListenerContainerFactory() {
//		ConcurrentKafkaListenerContainerFactory<String, List<OptionDataModel>> factory = new ConcurrentKafkaListenerContainerFactory<>();
//		factory.setConsumerFactory(consumerFactory());
//		return factory;
//	}
//}