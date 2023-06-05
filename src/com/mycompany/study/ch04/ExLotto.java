package com.mycompany.study.ch04;

public class ExLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		번호 추출
//		오름차순 정렬
//		중복값 확인
//		3연속 번호 거르기
//		추출된 값 String으로 변환
//		기존 값들과 비교
//		최종판단
		
		int min = 1;
		int max = 45;
		int[] arrLotto = new int[6];
		
		System.out.println("----- 로또 번호 생성기 -----");
		
		for(int i=0; i<=5; i++) {
			for(int n=1; n<=4; n++) {
				if(arrLotto[i] == arrLotto[n]) {
					
				}
			}
			arrLotto[i] = (int) ((Math.random() * (max - min)) + min);
		}
		
			
		
	}

	

}
