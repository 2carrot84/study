package com.example.demo.lombok;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Target2 implements TargetInterface {
	@Override
	public void printMsg() {
		System.out.println("Hello, Java!");
	}
}
