package com.mycompany.study.ch03;

public class ExLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 논리 연산자 (&&, ||, ^)
		//	&& = & : and : 논리곱 : 연산 참 참 참 , 나머지 폴스	// 둘 다 참일 때만 참, 나머지는 폴스
		//	|| = | : or : 논리합 : 연산 참 폴스 참, 폴스 참 참 , 참 참 참, 폴스 폴스 폴스	// 하나만 참이여도 참, 둘 다 폴스일 때 폴스
		//	^ = 배타적 논리합 : 연산 참 참 폴스, 폴스 폴스 폴스, 참 폴스 참, 폴스 참 참	// 서로 같을 때 폴스, 서로 다르면 참
		
		int a = 65;
		
		if(a >= 65 && a <= 70) {
			System.out.println("&&: TRUE");
		}
		
		if(a >= 65 & a <= 70) {
			System.out.println("&: TRUE");
		}
		
		if(a > 65 && a <= 70) {	// 출력 X
			System.out.println("&&: TRUE");
		}
		
		if(a > 65 || a <= 70) {
			System.out.println("||: TRUE");
		}
		
		if(a > 65 ^ a <= 70) {
			System.out.println("^1: TRUE");
		}
		
		if(a >= 65 ^ a <= 70) {	// 출력 X
			System.out.println("^2: TRUE");
		}
		
	}

}
