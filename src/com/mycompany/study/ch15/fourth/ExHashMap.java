package com.mycompany.study.ch15.fourth;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {
	
	public static void main(String[] args) {
	
		Map<String, Integer> map = new HashMap<String, Integer>();		// standard
		Map<String, Integer> map2 = new HashMap<>();
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();		// not bad
		
		map.put("Jay", 100);
		map.put("Alice", 99);
		map.put("John", 98);
		map.put("Michael", 97);
		
//		System.out.println("map.get(\"Jay\"): " + map.get("Jay"));
		
		map.remove("John");		// map에 있는 데이터 삭제
		map.clear();	// map 전체 삭제
		
		
		for(String strKey : map.keySet()) {
			Integer strValue = map.get(strKey);
			System.out.println(strKey + ": " + strValue);
		}
	
	}

}
