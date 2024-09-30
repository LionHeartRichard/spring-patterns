package com.patterns.techtrain2019.neveruseswitch;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailSender {

	@Autowired
	private Map<String, MailGenerator> map;

	public void send(MailInfo mailInfo) {
		String code = mailInfo.getTemplateCode();
		MailGenerator mailGenerator = map.get(code);
		if (mailGenerator == null) {
			throw new UnsupportedOperationException(code + " not supported yet");
		}
		String html = mailGenerator.generate(mailInfo);
		sendMail(html);
	}

	private void sendMail(String html) {
		System.out.println("was send = " + html);
	}
}
