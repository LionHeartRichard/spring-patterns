package com.patterns.techtrain2019.neveruseswitch;

import org.springframework.stereotype.Component;

@Component("add-processor")
public class AddProcessor implements Processor {

	@Override
	public void apply() {
		System.out.println("_".repeat(20) + "method - ADD");
	}

}
