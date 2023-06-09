package com.mycompany.study.ch06.first;

public class Mp3 {
	
	// field
	String name = "mp3";
	String company = "아이리버";
	int storage = 100;
	String color = "스카이블루";
	
	// method
	void play() {
		System.out.println("음악을 재생합니다.");
	}
	
	void pause() {
		System.out.println("음악을 일시중지합니다.");
	}
	
	void prev() {
		System.out.println("이전 곡을 재생합니다.");
	}
	
	void next() {
		System.out.println("다음 곡을 재생합니다.");
	}
	

}
