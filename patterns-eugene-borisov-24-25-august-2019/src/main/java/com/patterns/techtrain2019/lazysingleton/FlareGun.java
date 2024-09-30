package com.patterns.techtrain2019.lazysingleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
@Lazy
public class FlareGun {

	@PostConstruct
	private void init() {
		System.out.println("Ракетница доставлена!!!");
	}

	public void faer() {
		System.out.println("Выстрел из ракетницы!!!");
	}

}
