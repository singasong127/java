package com.mycompany.study.ch06.TrFirst;

import java.util.Date;

public class Member {
	
	// field
	String name;
	String id;
	String password;
	String email;
	String nickname;
	int gender;
	int zipcode;
	String address;
	boolean checkAgree;
	Date checkAgreeDT;
	
	// method
	void checkId() {
		System.out.println("아이디 중복 여부를 확인합니다.");
	}
	
	void checkPw() {
		System.out.println("비밀번호를 확인합니다.");
	}
	
	void searchAddress() {
		System.out.println("도로명 주소를 조회합니다.");
	}
}
