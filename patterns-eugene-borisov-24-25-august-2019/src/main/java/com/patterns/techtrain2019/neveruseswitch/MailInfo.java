package com.patterns.techtrain2019.neveruseswitch;

import org.springframework.stereotype.Component;

@Component
public class MailInfo {

	private String templateCode;
	private String content;

	public String getTemplateCode() {
		return templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Faker content(Faker fact) {
		
		return fact;
	}

	public static MailInfo builder() {
		MailInfo mailInfo = new MailInfo();
		return mailInfo;
	}

	public MailInfo build() {
		return this;
	}
}
