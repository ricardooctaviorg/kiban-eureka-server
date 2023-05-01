package com.finalsoft.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KibanEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KibanEurekaServerApplication.class, args);
	}

}
