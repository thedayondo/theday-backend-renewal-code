package com.theday.backend.renewal.theday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ThedayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThedayApplication.class, args);
	}
}
