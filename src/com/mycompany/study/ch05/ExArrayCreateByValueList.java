package com.mycompany.study.ch05;

public class ExArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] total;
		double[] avg;
		
		char[] grade;
		
		boolean[] score;
		
		int[] scoreChemistry = {100, 99, 98, 97, 96, 95, 94};
		
//		scoreChemistry[7] = 93;	// compile error
		scoreChemistry[0] = 0;	// 값은 변경 가능
		
		String[] scoreStudent = {"김동현","이지현","최세윤","박정현","강우진"};
		char[] scoreGrade = {'A','B','C','D','F'};
		
		//	int[] scorePhysics
		//	scorePhysics = {100, 99, 98, 97, 96};	// error
		//	선언과 동시에 초기화
		
		int a = scoreChemistry.length;
		
		int sum = 0;
		
		for(int i=0; i<scoreChemistry.length; i++) {
			sum += scoreChemistry[i];
			System.out.println(i + "번째 인덱스의 총합은 " + sum);
		}
//		
//		System.out.println("-----------");
//		
//		int i = 0;
//		int sum2 = 0;
//		
//		while(i<scoreChemistry.length)  {
//			
//			sum2 += scoreChemistry[i];
//			i++;
//		} System.out.println(sum2);
//		
//		System.out.println("----------");
//		
////		향상된 for문
//		for(int bb: scoreChemistry) {
//			System.out.println(bb);
//		}
		
		
		
	}

}
