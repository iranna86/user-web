package com.iru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserWebApplication.class, args);
	}
	
	//@Load
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
