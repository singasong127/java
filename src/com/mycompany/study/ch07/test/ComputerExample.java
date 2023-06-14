package com.mycompany.study.ch07.test;


public class ComputerExample extends Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator paramCal = new Calculator();
		Computer paramCom = new Computer();
		
		System.out.println("원의 반지름: " + r);
		System.out.println();
		
		System.out.println("Calculator 객체의 원면적을 구하는 프로그램 실행");
		System.out.println("원면적: " + paramCal.param(Constants.PAI_1, r));
		System.out.println();
		
		System.out.println("Computer 객체의 원면적을 구하는 프로그램 실행");
		System.out.println("원면적: " + paramCom.param(Constants.PAI_2, r));
		

	}

}
