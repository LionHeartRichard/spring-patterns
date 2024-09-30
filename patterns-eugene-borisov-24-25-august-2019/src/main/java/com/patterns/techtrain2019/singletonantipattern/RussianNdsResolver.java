package com.patterns.techtrain2019.singletonantipattern;

import org.springframework.stereotype.Component;

@Component
public class RussianNdsResolver implements NdsResolver {

	private double nds;

	public RussianNdsResolver() {
		super();
		this.nds = getNdsFromCentralBank();
	}

	private double getNdsFromCentralBank() {
		try {
			System.out.println("Выполняется  длительная бизнес логика - узнать у ЦБ текущий НДС");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.err.println(" Errors in method getNdsFromCentralBank()" + e.getMessage());
		}
		return 0.18;
	}

	@Override
	public double getNds() {
		return nds;
	}

}
