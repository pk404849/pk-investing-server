package com.pk.investing.server.config.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {

	 @Override
	    public void configureMessageBroker(MessageBrokerRegistry config) {
	        config.enableSimpleBroker("/topic");
	        config.setApplicationDestinationPrefixes("/app");
	    }

	    @Override
	    public void registerStompEndpoints(StompEndpointRegistry registry) {
	        registry.addEndpoint("/ws-option-chain")
	                .setAllowedOriginPatterns("*")
	                .withSockJS();
	    }
	
	
	
	
	
	
//	@Override
//	public void registerStompEndpoints(StompEndpointRegistry registry) {
////         registry.addEndpoint("/chat");
////         registry.addEndpoint("/chat").withSockJS();
//		registry.addEndpoint("/ws").setAllowedOrigins("http://localhost:4200").withSockJS();
//		
//	}
//
//	@Override
//    public void configureMessageBroker(MessageBrokerRegistry config) {
//        config.enableSimpleBroker("/topic");
//        config.setApplicationDestinationPrefixes("/app");
//    }
 
}
