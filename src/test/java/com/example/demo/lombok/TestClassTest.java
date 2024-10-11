package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestClassTest {

	@Autowired
	private TestClass testClass;

	@Test
	void test1() {
		testClass.test();
	}
}