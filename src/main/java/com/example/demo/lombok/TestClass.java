package com.example.demo.lombok;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TestClass {
	@Qualifier("target2")
	private final TargetInterface target;

	public void test() {
		target.printMsg();
	}
}
