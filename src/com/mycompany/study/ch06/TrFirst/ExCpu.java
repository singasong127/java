package com.mycompany.study.ch06.TrFirst;

public class ExCpu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cpu cpu = new Cpu("Intel", "i9-13900K", "raptor-lake", 16, 32, 5.5, 40);
		Cpu cpu2 = new Cpu("AMD", "R7 7800X3D", "Raphael", 8, 16, 4.5, 96);
		
		System.out.println("제조사: " + cpu.company);
		System.out.println("제품명: " + cpu.name);
		System.out.println("아키텍처명 : " + cpu.nick);
		System.out.println("코어 수: " + cpu.core);
		System.out.println("쓰레드 수: " + cpu.thread);
		System.out.println("부스트 클럭: " + cpu.clock + "GHz");
		System.out.println("L3 cache: " + cpu.cache + "MB");
		
		System.out.println("================================");
		
		System.out.println("제조사: " + cpu2.company);
		System.out.println("제품명: " + cpu2.name);
		System.out.println("아키텍처명 : " + cpu2.nick);
		System.out.println("코어 수: " + cpu2.core);
		System.out.println("쓰레드 수: " + cpu2.thread);
		System.out.println("부스트 클럭: " + cpu2.clock + "GHz");
		System.out.println("L3 cache: " + cpu2.cache + "MB");
		
	}

}
