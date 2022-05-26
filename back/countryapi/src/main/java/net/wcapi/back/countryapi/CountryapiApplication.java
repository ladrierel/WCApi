package net.wcapi.back.countryapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class CountryapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CountryapiApplication.class, args);
	}

    @Override
    public void run(String[] args) throws IOException {

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //read json file and convert to customer object
        Rankings rank = objectMapper.readValue(new File("rankingWork.json"), Rankings.class);

        //print rank details
		System.out.println(rank);
		// System.out.println(rank[1]);
    }

}
