package com.patterns.techtrain2019.neveruseswitch.useid;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Sender {

	@Autowired
	private Map<String, Mail> mails;

	public void send(Info info) {
		String typeMail = info.getType();
		Mail mail = mails.get(typeMail);
		if (mail == null) {
			throw new UnsupportedOperationException(typeMail + " not supported yet");
		}
		String http = mail.message(info);
		sendMail(http);
	}

	public void sendMail(String http) {
		System.out.println(" was send mail: " + http);
	}

	public int getAmountTypesMail() {
		return mails.size();
	}
}
