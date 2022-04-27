package com.sadatmalik.fusionconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FusionConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FusionConfigApplication.class, args);
	}

}
