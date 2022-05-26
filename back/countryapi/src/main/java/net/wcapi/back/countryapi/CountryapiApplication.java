package net.wcapi.back.countryapi;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

import java.util.logging.Logger;
import java.util.logging.Level;

@SpringBootApplication
public class CountryapiApplication implements CommandLineRunner {

    //create Logger
    private static final Logger LOGGER = Logger.getLogger(CountryapiApplication.class.getPackage().getName());

	public static void main(String[] args) {
		SpringApplication.run(CountryapiApplication.class, args);
	}

    @Override
    public void run(String[] args) throws IOException {

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //read json file and convert to customer object
        Rankings rank = objectMapper.readValue(new File("ranking.json"), Rankings.class);

        //print rank details as Debug
        LOGGER.log(Level.INFO, "Get the Mapping for JSON file ranking.json");
        //LOGGER.log(Level.INFO, "rank" + rank.toString());
        LOGGER.log(Level.INFO, "rank index 0" + rank.getRankings().get(0).toString());
        LOGGER.log(Level.INFO, "rank index 1" + rank.getRankings().get(1).toString());

		//System.out.println(rank);
        //System.out.println(rank.getRankings().get(0));
        //System.out.println(rank.getRankings().get(1));
		// System.out.println(rank[1]);
    }

}
