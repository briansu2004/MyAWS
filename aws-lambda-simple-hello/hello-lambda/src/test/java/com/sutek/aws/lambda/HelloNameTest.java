package com.sutek.aws.lambda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloNameTest {

	@BeforeEach
	void setUp() {
	}

	@Test
	public void shouldReturnHelloMessage() {
		var sut = new HelloName();
		assertEquals("Hello Brian", sut.handelRequest("Brian"));
	}

	@AfterEach
	void tearDown() {
	}
}