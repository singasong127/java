package com.mycompany.study.ch07.trFirst;

public class TrCellPhone {
	
	public String model;
	public String company;
	
	TrCellPhone(String model, String company) {
		this.model = model;
		this.company = company;
	}
	
	TrCellPhone() {
		
	}
	
	public void turnOn() {
		System.out.println("전원을 킵니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	
	public void alarm() {
		System.out.println("띵~");
	}
	
	public void mannerMode() {
		System.out.println("무음모드 입니다.");
	}
	
}
