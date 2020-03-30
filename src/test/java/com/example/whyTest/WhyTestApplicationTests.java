package com.example.whyTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WhyTestApplicationTests {

	@Test
	void contextLoads() {
		
		int i100=100;
		
		assertEquals(10, i100);
	}
	

}
