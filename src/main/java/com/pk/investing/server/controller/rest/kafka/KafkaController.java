package com.pk.investing.server.controller.rest.kafka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pk.investing.server.model.DeltaOptionChainDataModel;
//import com.pk.investing.server.service.kafka.KafkaProducerService;
import com.pk.investing.server.service.scheduler.DeltaOptionChainServiceScheduler;

@RestController
public class KafkaController {

//    private final KafkaProducerService kafkaProducerService;

    @Autowired
    private DeltaOptionChainServiceScheduler deltaOptionChainServiceScheduler;
    
//    public KafkaController(KafkaProducerService kafkaProducerService) {
//        this.kafkaProducerService = kafkaProducerService;
//    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
    //    kafkaProducerService.sendMessage(message);
        return "Message sent successfully";
    }
    @GetMapping("/fetch-data")
    public ResponseEntity<?> fetchDeltaOptionChainData(){
//    	List<DeltaOptionChainDataModel> deltaOptionChainData = deltaOptionChainServiceScheduler.fetchDeltaOptionChainData();
//    	
//    	return ResponseEntity.ok(deltaOptionChainData);
    	return null;
    }
}