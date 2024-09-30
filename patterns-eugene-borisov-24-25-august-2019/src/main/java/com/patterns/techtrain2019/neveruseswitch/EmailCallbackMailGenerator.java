package com.patterns.techtrain2019.neveruseswitch;

import org.springframework.stereotype.Component;

@Component("2")
public class EmailCallbackMailGenerator implements MailGenerator {

	@Override
	public String generate(MailInfo mailInfo) {
		return mailInfo.getContent() + "\n dont't call us Nicolas";
	}

}
