package com.baina;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class BatchKafkaProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchKafkaProducerAppApplication.class, args);
	}

}
