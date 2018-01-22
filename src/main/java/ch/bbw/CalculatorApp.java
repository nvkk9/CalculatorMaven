package ch.bbw;

/**
 * Console Calculator App
 * @author Nik Bertschinger
 * @version 0.0.1
 * */

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int valueA = 0;
		int valueB = 0;
		
		System.out.println("Console Calculator");
		System.out.println("------------------");
		System.out.println();
		
		valueA = 10;
		valueB = 20;
		
		System.out.println("Summe " + valueA + " + " + valueB + " = " + calc.summe(valueA, valueB));

	}

}
