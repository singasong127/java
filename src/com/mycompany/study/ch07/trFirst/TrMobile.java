package com.mycompany.study.ch07.trFirst;

public class TrMobile extends TrCellPhone {
	
	String model = "iPhone 14 Pro";
	String company = "Apple";
	
	public void siri() {
		System.out.println("Hey, Siri");
	}
	
	@Override
	public void turnOn() {
		super.turnOn();
	}
	
	@Override
	public void alarm() {
		System.out.println("rrrrrrrr");
	}
	
	
}
