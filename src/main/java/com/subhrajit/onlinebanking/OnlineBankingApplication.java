package com.subhrajit.onlinebanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OnlineBankingApplication {

	public static ConfigurableApplicationContext applicationContext = null;
	
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(OnlineBankingApplication.class, args);
	}

}
