package com.mycompany.study.ch06.second;

public class Car {
		
	// field
	int engine;
	String name;
	String color;
	String company;
		
	Car() {	// 기본생성자
		
	}
	
	Car(String color) {
		this.color = color;
	}
	
	Car(int engine, String name, String color, String company) {
		this.engine = engine;
		this.name = name;
		this.color = color;
		this.company = company;
	}
	
	
	// method
	void goFront() {
		System.out.println("앞으로 갑니다.");
	}
		
	void goBack() {
		System.out.println("뒤로 갑니다.");
	}
		
}
