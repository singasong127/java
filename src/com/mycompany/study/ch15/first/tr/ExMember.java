package com.mycompany.study.ch15.first.tr;

import java.util.ArrayList;

public class ExMember {

	public static void main(String[] args) {
		
		// ArrayList 객체 생성
		ArrayList<Member> members = new ArrayList<Member>();
		
		// Member 객체 생성
		Member member1 = new Member("Ann", "rh255", "rha1234", "010-1234-5678", "rh255@gmail.com");
		Member member2 = new Member("Alice", "strng777", "rabb3561", "010-3131-5816", "strng777@gmail.com");
		Member member3 = new Member("Tom", "hatejerry", "cat13056", "010-4444-4444", "hatejerry@gmail.com");
		
		// ArrayList 객체에 데이터 삽입
		members.add(member1);
		members.add(member2);
		members.add(member3);
		
		// ArrayList에 저장된 데이터 반복 표시
//		for(Member mem: members) {
////			Member mem = members[i];
//			System.out.println(mem.name + " | " + mem.id + " | " + mem.password + " | " + mem.tel + " | " + mem.email);
//			System.out.println();
//		}
		
		for(int i=0; i<members.size(); i++) {
//			members.get(i) => 객체의 데이터가 담긴 메모리 주소
			System.out.print(members.get(i).name + " | ");
			System.out.print(members.get(i).id + " | ");
			System.out.print(members.get(i).password + " | ");
			System.out.print(members.get(i).tel + " | ");
			System.out.print(members.get(i).email);
			System.out.println();
		}
		
		
	}

}
