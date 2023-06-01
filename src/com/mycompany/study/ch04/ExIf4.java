package com.mycompany.study.ch04;

public class ExIf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = -1;
		int y = 0;
		
		// (a,b)는 1사분면에 위치합니다
		// 1사분면 : (x, y)
		// 2사분면 : (-x, y)
		// 3사분면 : (-x, -y)
		// 4사분면 : (x, -y)
		
		if(x > 0) {
			if(y > 0) {
				System.out.println("(" + x + ", " + y + ")는 1사분면에 위치합니다.");
			} else if(y == 0) {
				System.out.println("X축 위에 있습니다.");
			} else {
				System.out.println("(" + x + ", " + y + ")는 4사분면에 위치합니다.");
			}
		} else if(x < 0) {
			if(y > 0) {
				System.out.println("(" + x + ", " + y + ")는 2사분면에 위치합니다.");
			} else if(x == 0) {
				System.out.println("Y축 위에 있습니다.");
			} else {
				System.out.println("(" + x + ", " + y + ")는 3사분면에 위치합니다.");
			}
		} else {
			System.out.println("원점입니다.");
		}
			

	}

}
