package com.patterns.techtrain2019.neveruseswitch.useid;

import org.springframework.stereotype.Component;

@Component("2")
public class HappyBirthday implements Mail {

	@Override
	public String message(Info info) {
		return "@".repeat(10) + "Happy Birthday Mail!!!" + info;
	}

}
