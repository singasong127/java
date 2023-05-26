package com.mycompany.study.ch02;

public class Tr_0526 {
	
	public static final String MY_NAME = "Song";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MY_NAME);
		
		double doubleVar = 123456789;
		
		float floatVar = (float) doubleVar;
		
		long longVar = (long) floatVar;
		
		int intVar = (int) longVar;
		
		short shortVar = (short) intVar;
		
		byte byteVar = (byte) shortVar;
		
		System.out.println(doubleVar);
		System.out.println(floatVar);
		System.out.println(longVar);
		System.out.println(intVar);
		System.out.println(shortVar);
		System.out.println(byteVar);
		
		System.out.println("---------------------------------");
		
		String stringVar = String.valueOf(intVar);
		System.out.println(stringVar);
		
		int intVar2 = Integer.parseInt(stringVar);
		System.out.println(intVar2);
		
		

	}

}
