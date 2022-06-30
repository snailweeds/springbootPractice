package com.example.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(RestaurantApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
