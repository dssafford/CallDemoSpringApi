package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {
		RestTemplate restTemplate = new RestTemplate();

		//Get One  - http://localhost:8081/findOne/56bf724777c819344346eeae
		//RecordEntity result = restTemplate.getForObject("http://localhost:8081/findOne/56be65e677c8cb12723e9495",  RecordEntity.class);

		//Update One Record
//		final String uri = "http://localhost:8081/updateOne/56be65e677c8cb12723e9495";
//
//		RecordEntity updatedEntity = new RecordEntity();
//		updatedEntity.setLastName("last");
//		updatedEntity.setFirstName("first");
//
//		restTemplate.put(uri,updatedEntity);

		// List All code
		//List<RecordEntity> entity = restTemplate.getForObject("http://localhost:8081/all", List.class);

		// Add code
		//		RecordEntity newEntity = new RecordEntity();
		//		newEntity.setFirstName("Adam");
		//		newEntity.setLastName("West");
		//
		//		RecordEntity result = restTemplate.postForObject("http://localhost:8081/add", newEntity , RecordEntity.class);

		log.info(updatedEntity.toString());
	}
}
