package com.mycompany.study.ch06.third;

public class ExArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 3;
//		int b = 2;
		
		Arithmetic arith = new Arithmetic();
		
//		int result = arith.add(a, b);
//		System.out.println("result: " + result);
		
		
//		int result2 = arith.subtraction(a, b);
//		System.out.println("result2: " + result2);
		
//		String result3 = arith.changeName("장원영");
//		System.out.println("result3: " + result3);
		
		arith.showText("아이브");
		
		int money = arith.lucky();
		System.out.println(money + "원을 주웠다.");
	}

}
