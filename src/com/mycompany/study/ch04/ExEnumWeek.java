package com.mycompany.study.ch04;

public class ExEnumWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		Week week;
		String abc;
		
//		abc = Week.MONDAY	// error: type mismatch
		abc = Week.MONDAY.toString();
		
		System.out.println(abc);

	}

}
