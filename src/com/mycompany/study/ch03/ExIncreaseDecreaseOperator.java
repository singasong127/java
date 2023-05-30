package com.mycompany.study.ch03;

public class ExIncreaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 증감 연산자 (++, --)
		int i = 0;
		int j = 0;
		
		++i;	// 1
		j++;	// 1
		
		int k = i++;	// k에 i를 대입, i를 1 증가
		int m = ++j;	// j를 1 증가, m에 j를 대입
		
		System.out.println("k: " + k);
		System.out.println("i: " + i);
		System.out.println("m: " + m);
		System.out.println("j: " + j);
		System.out.println("-----------------------------");
		
		--i;
		int z = ++i + j++;
		
		System.out.println("z: " + z);
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("-----------------------------");
		
		int a = 1;
		int b = 1;
		
		a--;
		--b;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		
		
		

	}

}
