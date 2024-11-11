package com.patterns.techtrain2019.neveruseswitch;

import org.springframework.stereotype.Component;

@Component("print-processor")
public class PrintProcessor implements Processor {

	@Override
	public void apply() {
		System.out.println("_".repeat(20) + "method - PRINT");
	}

}
