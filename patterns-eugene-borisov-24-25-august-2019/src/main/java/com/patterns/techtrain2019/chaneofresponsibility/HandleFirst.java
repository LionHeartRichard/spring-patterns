package com.patterns.techtrain2019.chaneofresponsibility;

import org.springframework.stereotype.Component;

@Component
public class HandleFirst implements Handler {
	@Override
	public void handle() {
		System.out.println("Run hundle FIRST");
	}

}
