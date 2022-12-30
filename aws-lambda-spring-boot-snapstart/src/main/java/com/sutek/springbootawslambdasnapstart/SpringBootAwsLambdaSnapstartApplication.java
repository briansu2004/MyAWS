package com.sutek.springbootawslambdasnapstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringBootAwsLambdaSnapstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsLambdaSnapstartApplication.class, args);
	}

	@Bean
	public Function<String, String> reverse() {
		return (s) -> String.valueOf(new StringBuilder(s).reverse());
	}

}
