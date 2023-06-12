package com.mycompany.study.ch06.seventh;

public class Person {
	
	public final String nation = "KOREA";
	final String snn;
	public String name;
	
	Person(String nation, String snn, String name) {
//		this.nation = nation;	// 이미 초기화 되어 있으므로 객체 생성 시 초기값 대입 불가능
		this.snn = snn;			// 초기화가 되어 있지 않으므로 객체 생성 시 초기값 대입으로 가능
		this.name = name;
	}
	
}
