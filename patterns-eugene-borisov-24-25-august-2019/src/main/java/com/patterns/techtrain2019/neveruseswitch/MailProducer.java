package com.patterns.techtrain2019.neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MailProducer {

	@Autowired
	private final MailSender mailSender;
	@Autowired
	private final Faker faker;

	public MailProducer(MailSender mailSender, Faker faker) {
		super();
		this.mailSender = mailSender;
		this.faker = faker;
	}

	@Scheduled(fixedDelay = 10)
	public void generateMail() {
		MailInfo mailInfo = MailInfo.builder().content(faker.chuckNorris().fact())
				.templeteCode(String.valueOf(faker.random().nextInt(2) + 1)).build();
		mailSender.send(mailInfo);
	}
}
