package com.patterns.techtrain2019.neveruseswitch.useid;

import org.springframework.stereotype.Component;

@Component("3")
public class DebtMail implements Mail {

	@Override
	public String message(Info info) {
		return "@".repeat(10) + " Dept MAil " + info;
	}

}
