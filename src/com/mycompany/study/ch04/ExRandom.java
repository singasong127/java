package com.mycompany.study.ch04;

public class ExRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 1;
		int max = 10;
		int random1 = (int) ((Math.random() * (max - min)) + min);
		int random2 = (int) ((Math.random() * (max - min)) + min);
		
		
		System.out.println(random1 + " + " + random2 + " = " + (random1 + random2));

	}

}
