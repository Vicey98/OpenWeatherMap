package com.example.OpenWeatherMap;

import org.springframework.boot.SpringApplication;

public class TestOpenWeatherMapApplication {

	public static void main(String[] args) {
		SpringApplication.from(OpenWeatherMapApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
