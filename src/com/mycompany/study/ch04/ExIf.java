package com.mycompany.study.ch04;

public class ExIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if - 학점 계산
		// A : 90 이상
		// B : 80 ~ 89
		// C : 70 ~ 79
		// D : 60 ~ 69
		// F : 59 이하
		
		int score = 95;
		
		if(score >= 90) {
			if(score >= 97) {
				System.out.println("당신의 학점은 A+입니다");
			} else if(score <= 96 && score >= 94) {
				System.out.println("당신의 학점은 A입니다");
			} else {
				System.out.println("당신의 학점은 A-입니다");
			}
		} else if(score <= 89 && score >= 80) {
			System.out.println("당신의 학점은 B입니다");
		} else if(score <= 79 && score >= 70) {
			System.out.println("당신의 학점은 C입니다");
		} else if(score <= 69 && score >= 60) {
			System.out.println("당신의 학점은 D입니다");
		} else {
			System.out.println("당신의 학점은 F입니다");
		}
		
		

	}

}
