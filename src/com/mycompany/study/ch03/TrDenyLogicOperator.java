package com.mycompany.study.ch03;

public class TrDenyLogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean play = true;
		
		play = !play;
		
		System.out.println("play: " + play);
		
		int i = 3;
		
		if(!(i == 3)) {
			System.out.println("뭔가를 해라!");
		}

	}

}
