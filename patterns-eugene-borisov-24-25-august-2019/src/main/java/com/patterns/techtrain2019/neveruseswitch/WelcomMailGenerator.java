package com.patterns.techtrain2019.neveruseswitch;

import org.springframework.stereotype.Component;

@Component("1")
public class WelcomMailGenerator implements MailGenerator {

	@Override
	public String generate(MailInfo mailInfo) {
		// 30 lines code
		return mailInfo.getContent() + "\n welcome mail";
	}

}
