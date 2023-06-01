package com.mycompany.study.ch04;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		// int 변수 3개를 선언하고
		// 세 변수 중에서 최대값, 최소값을 구하는 프로그램 작성
		
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
				System.out.println("최대값은 " + a);
			} else if(b > a && b > c) {
				System.out.println("최대값은 " + b);
			} else {
				System.out.println("최대값은 " + c);
			}
			
			if(a < b && a < c) {
				System.out.println("최소값은 " + a);
			} else if(b < a && b < c) {
				System.out.println("최소값은 " + b);
			} else {
				System.out.println("최소값은 " + c);
			}
			
			
		} else {
			System.out.println("동일한 정수가 존재합니다.");
		}

	}

}
