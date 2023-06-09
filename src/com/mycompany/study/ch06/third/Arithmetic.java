package com.mycompany.study.ch06.third;

public class Arithmetic {
	
	
	// 더하기 함수(피연산자 2개 제한)
	public int add(int a, int b) {
		int y = a + b;
		return y;
	}
	
	
	// 빼기 함수
	public int subtraction(int a, int b) {
		int y = a - b;
		return y;
	}
	
	// 곱하기 함수
	public int multiply(int a, int b) {
		int y = a * b;
		return y;
	}
	
	public String changeName(String name) {
		String result;
		
		if(name.equals("장원영")) {
			result = "Tony";
		} else {
			result = "I don`t know";
		}
		
		return result;
	}
	
	public void showText(String group) {
		if(group.equals("아이브")) {
			System.out.println("장원영은 너무 예뻐!");
		}
	}
	
	public int lucky() {
		
		return 10000;
	}
}
