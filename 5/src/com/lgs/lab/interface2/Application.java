package com.lgs.lab.interface2;

public class Application {

	public static void main(String[] args) {
		
		MyCalculator MyCalculator = new MyCalculator(10, 2);
		MyCalculator.plusOperation();
		MyCalculator.divideOperation();
		MyCalculator.minusOperation();
		MyCalculator.multiplyOperation();

	}

}
