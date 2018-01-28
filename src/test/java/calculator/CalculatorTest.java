package calculator;

/**
 * Test Class for class Calculator
 * 
 * @author Nik Bertschinger
 * @version 0.0.1
 * */

import static org.junit.Assert.*;

import org.junit.Test;

import ch.bbw.Calculator;

public class CalculatorTest {
	Calculator testee;

	@Test
	public void test() {
		
	}
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}

	@Test
	public void testSummeZweiNegative() {
		
	}
	
	@Test
	public void testSummeZweiNull() {
		
	}

}
