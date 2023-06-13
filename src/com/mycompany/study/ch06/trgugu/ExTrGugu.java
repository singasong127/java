package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class ExTrGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		TrGugu gugu = new TrGugu();
		
		while(gugu.z) {
			System.out.println("정수를 입력해 주세요");
			int scanInt = scanner.nextInt();
			
			if(scanInt != 0) {
				gugu.gugudan(scanInt);
			} else {
				System.out.println("프로그램 종료");
				gugu.z = false;
			}
		}
		
	}

}
