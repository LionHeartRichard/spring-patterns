package com.patterns.techtrain2019.lazysingleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Schwarznegger {

	@Autowired
	@Lazy
	private FlareGun flareGun;

	@EventListener(ContextRefreshedEvent.class)
	public void start() {
		if (isEnemiesLessThan100()) {
			hitWithLog();
		} else {
			flareGun.faer();
		}
	}

	private void hitWithLog() {
		System.out.println("тыдыщ тыдыщ бревном");
	}

	private boolean isEnemiesLessThan100() {
		return true;
	}
}
