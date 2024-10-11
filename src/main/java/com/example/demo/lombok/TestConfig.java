package com.example.demo.lombok;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

	@Bean
	public TargetInterface getTarget() {
		return new Target();
	}

	@Bean
	@Qualifier("target2")
	public TargetInterface getTarget2() {
		return new Target2();
	}
}
