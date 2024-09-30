package com.patterns.techtrain2019.singletonantipattern;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TaxCalculator {

	private NdsResolver ndsResolver;

	public TaxCalculator() {
		super();
	}

	public TaxCalculator(NdsResolver ndsResolver) {
		super();
		this.ndsResolver = ndsResolver;
	}

	public double withNds(double price) {
		return price * ndsResolver.getNds() + price;
	}

}
