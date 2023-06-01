package com.mycompany.study.ch04;

public class ExForOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 부터 10까지 더하는 프로그램 작성
		
		int sum = 0;
		
		//	for(int i = 1; i <= 10; i++) {
			//	sum = sum + i;
			//	System.out.println(sum);
		//	}
		
		
		// 11 ~ 50까지 짝수의 합
		for(int i = 11; i <= 50; i++) {
			if(i % 2 == 0)
			
			sum = sum + i;
			System.out.println(i + " | " + sum);
		}
		
	}

}
