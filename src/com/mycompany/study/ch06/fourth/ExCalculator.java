package com.mycompany.study.ch06.fourth;

public class ExCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		
		double result = cal.areaSquare(5);
		double result2 =  cal.areaSquare(5, 6);
		
		System.out.println("result: " + result);
		System.out.println("result2: " + result2);

	}

}
