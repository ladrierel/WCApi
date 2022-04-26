package net.wcapi.back.countryapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

	@GetMapping("/getCountry")
	public Country getCountry(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Country("Brésil", "BRA", "https://api.fifa.com/api/v1/picture/flags-sq-3/BRA", 1);
	}
}