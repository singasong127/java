package com.mycompany.study.ch05;

public class ExArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] score = { {99,88,55}, {55,77,66}, {55,55,44}, {55,44,33}, {66,77,88} };
		
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.println("score[" + i + "][" + j + "]:" + score[i][j]);
//			}
//		}
		
		
		String[] name = {"장동건", "차태식", "마동석", "마장동", "이태식"};
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sum = 0;
		int avg = 0;
		
		
		int[] sumEach = {0,0,0,0,0};
		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
			
				switch(j) {
				case 0 :
					sumKor = sumKor + score[i][j];
					break;
				case 1 : 
					sumEng = sumEng + score[i][j];
					break;
				case 2 :	
					sumMath = sumMath + score[i][j];
				}
				sumEach[i] = sumEach[i] + score[i][j];
				
			}
			
				
		}
		
		
		
	}

}
