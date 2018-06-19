package com.aidata.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringTest03EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTest03EurekaServerApplication.class, args);
	}
}
