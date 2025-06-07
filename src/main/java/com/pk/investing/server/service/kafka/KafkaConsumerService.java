//package com.pk.investing.server.service.kafka;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.stereotype.Service;
//
//import com.pk.investing.server.model.DeltaOptionChainDataModel;
//import com.pk.investing.server.model.OptionDataModel;
//
//@Service
//public class KafkaConsumerService {
//
//	@Autowired
//    private SimpMessagingTemplate messagingTemplate;
//	
//    @KafkaListener(topics = "kafka_topic", groupId = "kafka_group_id")
//    public void consume(List<OptionDataModel> modelList) {
//        System.out.println("Message received: modelList : " + modelList);
////        WebSocketChatMessage wbm = new WebSocketChatMessage();
////        wbm.setMessage("message receive from kafka");
////        webSocketController.sendMessage(wbm);
//      //  webSocketController.sendMessage(modelList);
//        messagingTemplate.convertAndSend("/topic/all-options", modelList);
//    }
//}
