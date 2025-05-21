package com.pk.investing.server.controller.rest.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.pk.investing.server.config.websocket.WebSocketChatMessage;



@RestController
@CrossOrigin(value = "http://localhost:4200")
public class WebSocketController {

	@MessageMapping("/chat.sendMessage")
	@SendTo("/topic/public")
	public WebSocketChatMessage sendMessage(@Payload WebSocketChatMessage webSocketChatMessage) {
		System.out.println(webSocketChatMessage);
		return webSocketChatMessage;
	}
	
	@MessageMapping("/chat.addUser")
	@SendTo("/topic/public")
	public WebSocketChatMessage addUser(@Payload
			WebSocketChatMessage webSocketChatMessage, 
			SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("userName", webSocketChatMessage.getMessageSenderName());
		System.out.println("new message ==> : "+webSocketChatMessage.getMessage());
		return webSocketChatMessage;
	}
}
