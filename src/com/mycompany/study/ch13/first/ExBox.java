package com.mycompany.study.ch13.first;

public class ExBox {

	public static void main(String[] args) {
		
		Box<String> box = new Box<>();
		box.setT("Jay");
		System.out.println(box.getT());
		
		Box<Integer> box2 = new Box<>();
		box2.setT(1);
		System.out.println(box2.getT());
		
		Box<Object> box3 = new Box<>();
		
	}

}
