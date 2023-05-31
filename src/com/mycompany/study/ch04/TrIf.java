package com.mycompany.study.ch04;

public class TrIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 학점 계산
		// A : 90점 이상
		// B : 80 ~ 89
		// C : 70 ~ 79
		// D : 60 ~ 69
		// F : 59점 이하
		// 7 이상 : +, 3 이하 : -
		
		int score = 81;
		
		if(score >= 90) {
			if(score >= 97) {
				System.out.println("당신의 학점은 A+입니다.");
			} else if(score <= 93) {
				System.out.println("당신의 학점은 A-입니다.");
			} else {
				System.out.println("당신의 학점은 A입니다.");
			}
		} else if(score >= 80) {
			if(score >= 87) {
				System.out.println("당신의 학점은 B+입니다.");
			} else if(score <= 83) {
				System.out.println("당신의 학점은 B-입니다.");
			} else {
				System.out.println("당신의 학점은 B입니다.");
			}
		} else if(score >= 70) {
			if(score >= 77) {
				System.out.println("당신의 학점은 C+입니다.");
			} else if(score <= 73) {
				System.out.println("당신의 학점은 C-입니다.");
			} else {
				System.out.println("당신의 학점은 C입니다.");
			}
		} else if(score >= 60) {
			if(score >= 67) {
				System.out.println("당신의 학점은 D+입니다.");
			} else if(score <= 63) {
				System.out.println("당신의 학점은 D-입니다.");
			} else {
				System.out.println("당신의 학점은 D입니다.");
			}
		} else {
			System.out.println("당신의 학점은 F입니다. 조금 더 분발합시다.");
		}
		
		System.out.println("----------------------------------------------------");
		
		// 할인율 계산
		
		// 일반 = 1, 5% 할인
		// 브론즈 = 2, 10% 할인
		// 실버 = 3, 15% 할인
		// 골드 = 4, 20% 할인
		// 플래티넘 = 5, 2.7% 할인
		
		int grade = 5;
		int cost = 10000;
		double saleCost;
		
		
		if(grade == 1) {
			saleCost = cost - cost * 0.05;
			System.out.println("정가가 " + cost + "원인 제품의 일반 등급의 할인가는 " + (int)saleCost + "원입니다.");
		} else if(grade == 2) {
			saleCost = cost - cost * 0.1;
			System.out.println("정가가 " + cost + "원인 제품의 브론즈 등급의 할인가는 " + (int)saleCost + "원입니다.");
		} else if(grade == 3) {
			saleCost = cost - cost * 0.15;
			System.out.println("정가가 " + cost + "원인 제품의 실버 등급의 할인가는 " + (int)saleCost + "원입니다.");
		} else if(grade == 4) {
			saleCost = cost - cost * 0.2;
			System.out.println("정가가 " + cost + "원인 제품의 골드 등급의 할인가는 " + (int)saleCost + "원입니다.");
		} else {
			saleCost = cost - cost * 0.027;
			System.out.println("정가가 " + cost + "원인 제품의 플래티넘 등급의 할인가는 " + (int)saleCost + "원입니다.");
		}
		
		System.out.println("----------------------------------------------------");
		
		// 짝수,홀수 판단
		
		int number = 3;
		
		if(number != 0) {
			if(number % 2 == 1) {
				System.out.println("입력하신 " + number + "은(는) 홀수입니다.");
			} else {
				System.out.println("입력하신 " + number + "은(는) 짝수입니다.");
			}
		} else {
			System.out.println("입력하신 " + number + "은(는) 판단할 수 없습니다.");
		}
		
		
		
	}

}
