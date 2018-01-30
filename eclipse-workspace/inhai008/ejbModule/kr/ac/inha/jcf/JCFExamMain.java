package kr.ac.inha.jcf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//import java.util.Set;

public class JCFExamMain {
	public static void main(String[] args) {
//		Set set = new Set();
		// Set계열을 테스트를 해보자.
		// 순서X, 중복X
		HashSet set = new HashSet();
		set.add("수민");
		set.add("현영");
		set.add("현진");
		set.add("수민");
		
		// Iterator 패턴
		for (Object str : set) {
//			System.out.println(str.toString());
			System.out.println(str);
		}
		
		System.out.println();
		
		// List 계열
		// 순서 O, 중복 O 
		ArrayList list = new ArrayList();
		list.add("오재훈");
		list.add("심재우");
		list.add("박세홍");
		list.add("민기");
		list.add("민기");		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// map계열을 테스트 해보자.
		// key,value가 한 쌍으로 존재한다. 
		// 값을 넣을때는 put(key, value);
		// 값을 가져올때는 get(key);
		Map map = new HashMap();
		map.put("stu01", "유종완");
		map.put("stu02", "김정택");
		map.put("stu03", "김근용");
		map.put("stu04", "심재우");
		
		System.out.println(map.get("stu01"));
//		System.out.println(map);
	}	
}



















