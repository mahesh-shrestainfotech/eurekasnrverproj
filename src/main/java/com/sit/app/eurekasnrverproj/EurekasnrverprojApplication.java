package com.sit.app.eurekasnrverproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekasnrverprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekasnrverprojApplication.class, args);
	}

}
