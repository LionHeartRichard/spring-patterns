package com.patterns.techtrain2019.neveruseswitch.useid;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Info {

	private Sender sender;

	public String getType() {
		return "" + getTypeNumberRandome();
	}

	public int getTypeNumberRandome() {
		Random random = new Random();
		int idx = random.nextInt(sender.getAmountTypesMail());
		return idx;
	}
}
