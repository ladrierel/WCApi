package net.wcapi.back.jacksonapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;


@SpringBootApplication
public class JacksonappApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JacksonappApplication.class, args);
    }

    @Override
    public void run(String[] args) throws IOException {

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //read json file and convert to customer object
        Customer customer = objectMapper.readValue(new File("Customer.json"), Customer.class);

        //print customer details
        System.out.println(customer);
    }

}
