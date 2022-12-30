package com.sutek.aws.lambda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloAWSLambdaTest {

	@BeforeEach
	void setUp() {
	}

	@Test
	public void shouldReturnHelloMessage() {
		var sut = new HelloAWSLambda();
		assertEquals("Hello AWS Lambda", sut.handelRequest());
	}

	@AfterEach
	void tearDown() {
	}
}