package com.example.data_collector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataCollectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataCollectorApplication.class, args);
	}

}
