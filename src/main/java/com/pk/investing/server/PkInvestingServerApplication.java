package com.pk.investing.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PkInvestingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PkInvestingServerApplication.class, args);
		System.out.println("======== main method completed successfully ==========");
	}

}
