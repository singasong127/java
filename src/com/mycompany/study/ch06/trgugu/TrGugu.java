package com.mycompany.study.ch06.trgugu;


public class TrGugu {
	
	public static int num;
	public static int i;
	public static int result;
	
	
	public static int gugudan() {
		
//		for(i=1; i<=9; i++) {
//			result = num * i;
//			System.out.println(num + " * " + i + " = " + result);
//		} 
		
		do {
			if(num != 0) {
				for(i=1; i<=9; i++) {
					result = num * i;
					System.out.println(num + " * " + i + " = " + result);
				}
			} else {
				break;
			}
		} while (num == 0);
		System.out.println("프로그램 종료");
		
		return result;
	}
	
}
