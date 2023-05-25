package com.mycompany.study.ch02;

public class Tr_0525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if(bool1) {
			System.out.println("bool1: " + bool1);
		} else {
			System.out.println("bool2: " + bool2);
		}
		
		byte byte01 = -128;
		byte byte02 = 127;
		// byte byte03 = -129; 	// error
		// byte byte04 = 128;	// error
		
		
		System.out.println("byte01 : " + byte01);
		System.out.println("byte02 : " + byte02);
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		int c4 = c1;
		char c5 = 44032;
		
		System.out.println("c4: " + c4);
		System.out.println("c5: " + c5);
		
		
		float f1 = 3;
		double f2 = 3;
		
		float f3 = 1.234567F;
		float f4 = 123456789;
		
		System.out.println("f1 : " + f1);
		System.out.println("f2 : " + f2);
		System.out.println("f3 : " + f3);
		System.out.println("f4 : " + f4);
		
		int var1 = 10;	// 10진수
		int var2 = 012;	// 8진수
		int var3 = 0xa;	// 16진수
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		
		long l1 = 1234567;
		long l2 = 2034560654503L;
		
		System.out.println("l1: " + l1);
		System.out.println("l2: " + l2);
		
		short promotion1 = byte02;
		System.out.println("promotion1: " + promotion1);
		int promotion2 = promotion1;
		System.out.println("promotion2: " + promotion2);
		long promotion3 = promotion2;
		System.out.println("promotion3: " + promotion3);
		float promotion4 = promotion3;
		System.out.println("promotion4: " + promotion4);
		double promotion5 = promotion4;
		System.out.println("promotion5: " + promotion5);
		

	}

}
