package com.patterns.techtrain2019.neveruseswitch.useid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class Producer {

	// TO DO!!!!!!!!!!!!!!!!!!
	@Autowired
	private Sender sender;

	public void generateMail() {
		sender.send(new Info());
	}
}
