package ch15;

import java.util.HashMap;

public class HashMapEx01{
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		
		hm.put("hyunji", "고양이와 먹방을..."); 
		hm.put("kyunghwa", "배구 실시간 방송"); 
		hm.put("hyungjin", "술먹방..필름 끊킬때까지"); 
		hm.put("youngjin", "철구와 욕배틀"); 
		hm.put(100,559); 

		System.out.println("현지id로 검색한 방-hm.get('hyunji') : "+hm.get("hyunji")); 
		System.out.println("형진이id로 검색한 방-hm.get('hyungjin') : "+hm.get("hyungjin"));
		System.out.println("hm.get(100) : "+hm.get(100));
	}
}