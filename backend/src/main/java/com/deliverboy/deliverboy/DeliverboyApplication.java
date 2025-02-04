package com.deliverboy.deliverboy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
@Profile("default")
@SpringBootApplication
public class DeliverboyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DeliverboyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
