package com.mycompany.study.ch05;

public class ExArrayCreateByNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[3];
//		arr1 = {100,99,98};	// error
		arr1[0] = 100;
		arr1[1] = 99;
		arr1[2] = 98;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		

	}

}
