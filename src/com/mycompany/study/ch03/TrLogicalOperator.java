package com.mycompany.study.ch03;

public class TrLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// && = & : 논리곱(AND)
		// 참 참 -> 참, 나머지 거짓
		// || = | : 논리합(OR)
		// 참 참 -> 참, 참 거짓 -> 참, 거짓 참 -> 참, 거짓 거짓 -> 거짓
		// ^ : 배타적 논리합(XOR)
		// 참 참 -> 거짓, 거짓 거짓 -> 거짓, 참 거짓 -> 참, 거짓 참 -> 참
		
		int a = 10;
		int b = 20;
		
		if(a <= b && a < b) {
			System.out.println("TRUE1");
		}
		if(a >= b & a < b) {	// 거짓 & 참 = 거짓
			System.out.println("TRUE2");
		}
		if(a <= b || a < b) {	
			System.out.println("TRUE3");
		}
		
		if(a >= b | a < b) {
			System.out.println("TRUE4");
		}
		if(a >= b || a == b) {	// 거짓 || 거짓 = 거짓
			System.out.println("TRUE5");
		}
	}

}
