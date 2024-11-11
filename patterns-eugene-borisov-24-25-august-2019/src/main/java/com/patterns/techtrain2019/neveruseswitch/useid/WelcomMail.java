package com.patterns.techtrain2019.neveruseswitch.useid;

import org.springframework.stereotype.Component;

@Component("1")
public class WelcomMail implements Mail {

	@Override
	public String message(Info info) {
		return "@".repeat(10) + "Welcom mail" + info;
	}

}
