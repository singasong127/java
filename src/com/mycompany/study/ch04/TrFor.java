package com.mycompany.study.ch04;

public class TrFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int sum2 = 0;
		
		// 1 ~ 10까지 총합
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.println(i + "번째 합은 " + sum);
		} System.out.println("총합은 " + sum);
		
		System.out.println("----------------------");
		
		
		for(int j=11; j<=50; j++) {
			if(j % 2 == 1) {
				System.out.println(sum2);
			} else {
				sum2 += j;
				System.out.println(sum2);
			}
		} System.out.println("Total : " + sum2);
		
		System.out.println("----------------------");
		
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		

	}

}
