package com.pk.investing.server.service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.pk.investing.server.config.websocket.WebSocketChatMessage;
import com.pk.investing.server.controller.rest.websocket.WebSocketController;

@Service
public class KafkaConsumerService {

	@Autowired
	private WebSocketController webSocketController;
	
    @KafkaListener(topics = "kafka_topic", groupId = "kafka_group_id")
    public void consume(String message) {
        System.out.println("Message received: " + message);
        WebSocketChatMessage wbm = new WebSocketChatMessage();
        wbm.setMessage("message receive from kafka");
        webSocketController.sendMessage(wbm);
    }
}
