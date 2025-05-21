package com.pk.investing.server.service.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

	private static final String KAFKA_TOPIC = "kafka_topic";

	private final KafkaTemplate<String, String> kafkaTemplate;

	public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(String message) {
		kafkaTemplate.send(KAFKA_TOPIC, message);
		System.out.println("Message sent: " + message);
	}
}