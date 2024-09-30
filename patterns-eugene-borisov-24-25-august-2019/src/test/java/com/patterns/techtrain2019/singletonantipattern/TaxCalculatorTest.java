package com.patterns.techtrain2019.singletonantipattern;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TaxCalculatorTest {

	@Test
	void test() {
		NdsResolver mock = Mockito.mock(NdsResolver.class);
		Mockito.when(mock.getNds()).thenReturn(0.2);
		double priceWithNds = new TaxCalculator(mock).withNds(100);
		Assert.assertEquals(120, priceWithNds, 0.00001);
	}

}
