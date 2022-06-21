package com.nttdata.serviceregistrybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryBankApplication.class, args);
	}

}
