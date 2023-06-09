package com.mycompany.study.ch06.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		System.out.println(a);
		
		Car car = new Car();	// 생성(기본 생성자)
		
		//	이하 사용
		System.out.println("car.name: " + car.name);
		System.out.println("car.engine: " + car.engine);
		System.out.println("car.color: " + car.color);
		System.out.println("car.company: " + car.company);
		
		System.out.println("----------------");
		
		Mp3 iriver = new Mp3();		// 생성
		
		System.out.println("iriver.color: " + iriver.color);
		System.out.println("iriver.name: " + iriver.name);
		System.out.println("iriver.company: " + iriver.company);
		System.out.println("iriver.storage: " + iriver.storage + "MB");
		
		iriver.play();		// 클래스 내 함수 실행
		iriver.pause();
		iriver.prev();
		iriver.next();
	}

}
