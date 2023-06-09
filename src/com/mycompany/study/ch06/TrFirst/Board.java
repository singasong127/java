package com.mycompany.study.ch06.TrFirst;

import java.util.Date;

public class Board {
	
	// field
	String title;
	int view;
	String writer;
	Date date;
	
	
	void board() {
		System.out.println("제목: " + title + " [" + view + "]");
		System.out.println("글쓴이: " + writer);
		System.out.println("날짜: " + date);
	}
	
}
