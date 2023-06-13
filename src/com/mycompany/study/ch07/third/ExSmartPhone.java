package com.mycompany.study.ch07.third;

public class ExSmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Phone phone = new Phone();	X
		
		SmartPhone smart = new SmartPhone("smartPhone");
		
		smart.turnOn();
		smart.internetSearch();
		smart.turnOff();
		smart.open();
		
	}

}
