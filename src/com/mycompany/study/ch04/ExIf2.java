package com.mycompany.study.ch04;

public class ExIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 일반 : 1, 5% 할인 적용
		// 브론즈 : 2, 10% 할인 적용
		// 실버 : 3, 15% 할인 적용
		// 골드 : 4, 20% 할인 적용
		// 플래티넘 : 5, 2.7% 할인 적용
		
		// 정가가 12000원인 실버 등급의 할인가는 10200원입니다.
		
		int grade = 3;	// 등급
		int cost = 12000;	// 가격
		double saleCost;
		
		// 할인율을 따로 변수 선언
		if(grade == 1) {
			saleCost = cost - cost * 0.05;
			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는 " + (int)saleCost + "원 입니다.");
		} else if(grade == 2) {
			saleCost = cost - cost * 0.1;
			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는 " + (int)saleCost + "원 입니다.");
		} else if(grade == 3) {
			saleCost = cost - cost * 0.15;
			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는 " + (int)saleCost + "원 입니다.");
		} else if(grade == 4) {
			saleCost = cost - cost * 0.2;
			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는 " + (int)saleCost + "원 입니다.");
		} else {
			saleCost = cost - cost * 0.027;
			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는 " + (int)saleCost + "원 입니다.");
		}
		
		
		//	변수 선언 안 하고 바로 연산식 삽입
		//	if(grade == 1) {
			//	System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는 " + (int)(cost - cost * 0.05) + "원 입니다.");
		//	} else if(grade == 2) {
			//	System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는 " + (int)(cost - cost * 0.1) + "원 입니다.");
		//	} else if(grade == 3) {
			//	System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는 " + (int)(cost - cost * 0.15) + "원 입니다.");
		//	} else if(grade == 4) {
			//	System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는 " + (int)(cost - cost * 0.2) + "원 입니다.");
		//	} else {
			//	System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는 " + (int)(cost - cost * 0.027) + "원 입니다.");
		//	}
	}

}
