package net.wcapi.back.countryapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
//import java.io.IOException;

import java.util.logging.Logger;
import java.util.logging.Level;

@RestController
public class CountryController {

    //create Logger
    private static final Logger LOGGER = Logger.getLogger(CountryController.class.getPackage().getName());


	@GetMapping("/getCountry")
	public Country getCountry(@RequestParam(value = "rank", defaultValue = "1") String position) {

		int r;

		//Display Log Message when controller is called
		LOGGER.log(Level.INFO, "Called getCountry");

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //read json file and convert to customer object
		try {
        	Rankings rank = objectMapper.readValue(new File("ranking.json"), Rankings.class);	
			//LOGGER.log(Level.INFO, "Use the rank object" + rank.getRankings().get(0));
			//LOGGER.log(Level.INFO, "Use the rank object" + rank.getRankings().get(22));

			//convert String r to int
			try {
				r = Integer.parseInt(position);
			} catch(NumberFormatException e) {
				r = 1;
				LOGGER.log(Level.WARNING, "getCountry : requested rank is not an int value");
			}

			//if out of ranking boudaries, set to return the first element of ranking
			if (r <= 0) {
				r = 1;
				LOGGER.log(Level.WARNING, "getCountry : requested rank <= 0, return first element");
			}
			if (r > rank.getRankings().size()) {
				r = 1;
				LOGGER.log(Level.WARNING, "getCountry : requested rank > number of countries, return first element");
			}

			return new Country(
				rank.getRankings().get(r-1).getRankingItem().getName(), 
				rank.getRankings().get(r-1).getRankingItem().getCountryCode(), 
				rank.getRankings().get(r-1).getRankingItem().getFlag().getSrc(), 
				rank.getRankings().get(r-1).getRankingItem().getRank()
			);
		} catch(Exception e) {
			LOGGER.log(Level.WARNING, "Exeption" + e.getMessage());
		}

		return new Country("Brésil", "BRA", "https://api.fifa.com/api/v1/picture/flags-sq-3/BRA", 1);
		//return new Country(  countryName, countryCode, countryFlagPath, countryRank);
	}
}