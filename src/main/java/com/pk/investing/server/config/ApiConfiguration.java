package com.pk.investing.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApiConfiguration {
	@Bean
	RestTemplate getRestclient() {
		return new RestTemplate();
	}
}
