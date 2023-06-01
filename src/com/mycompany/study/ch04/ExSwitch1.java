package com.mycompany.study.ch04;

public class ExSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			default:
				System.out.println("1번도 2번도 아닌 것이 나왔습니다.");
				break;
		}
		
		String postion = "나";
		
		switch(postion) {
			case "사장" :
				System.out.println("사장의 연봉은 10억입니다.");
				break;
			case "부장" :
				System.out.println("부장의 연봉은 20000입니다.");
				break;
			case "과장" :
				System.out.println("과장의 연봉은 8000입니다.");
				break;
			case "대리" :
				System.out.println("대리의 연봉은 5000입니다.");
				break;
			case "주임" :
				System.out.println("주임의 연봉은 4000입니다.");
				break;
			case "사원" :
				System.out.println("사원의 연봉은 3500입니다.");
				break;
			default :
				System.out.println("나의 연봉은 0입니다.");
				break;
		}
		
	}

}
