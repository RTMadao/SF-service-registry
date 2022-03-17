package com.salcedoFawccet.services.eurekadirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDirectoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDirectoryApplication.class, args);
	}

}
