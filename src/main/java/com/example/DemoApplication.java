package com.example;

import com.sun.prism.impl.Disposer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import java.util.Map;
import java.util.HashMap;

import java.util.List;

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
		//RecordEntity result = restTemplate.getForObject("http://localhost:8081/findOne/56bf724777c819344346eeae",  RecordEntity.class);


		//Update One Record
		final String uri = "http://localhost:8081/updateOne/56bf724777c819344346eeae";

		Map<String, String> params = new HashMap<String, String>();
		params.put("firstName", "doodie");
		params.put("lastName", "crap head");

		RecordEntity updatedEntity = new RecordEntity();

		restTemplate.put ( uri, updatedEntity, params);

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
