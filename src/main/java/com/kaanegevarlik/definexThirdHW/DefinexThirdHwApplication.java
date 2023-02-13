package com.kaanegevarlik.definexThirdHW;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DefinexThirdHwApplication {

	public static void main(String[] args) {

		SpringApplication.run(DefinexThirdHwApplication.class, args);

		WeatherAPI tester = new WeatherAPI(); // this is just an object for testing purposes

		tester.getRequest();
	}

}
