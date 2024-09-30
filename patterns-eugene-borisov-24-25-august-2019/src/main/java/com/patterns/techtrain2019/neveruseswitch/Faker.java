package com.patterns.techtrain2019.neveruseswitch;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Faker {

	private Random randome;

	public Faker chuckNorris() {

		return null;
	}

	public Faker fact() {
		// TODO Auto-generated method stub
		return null;
	}

	public Faker random() {
		this.randome = new Random();
		return this;
	}

	public int nextInt(int numberPhraseGenerator) {
		return this.randome.nextInt(numberPhraseGenerator);
	}

	public MailInfo templeteCode(String valueOf) {
		// TODO Auto-generated method stub
		return null;
	}

}
