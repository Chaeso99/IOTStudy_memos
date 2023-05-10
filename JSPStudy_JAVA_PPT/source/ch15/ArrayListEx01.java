package ch15;

import java.util.ArrayList;

public class ArrayListEx01{
	public static void main(String[] args) {

		ArrayList<String> list  = new ArrayList<String>();


		list.add("훈남 정동진");
		list.add("미남 김영진");
		list.add("귀염이 최주호");

		for(int i=0;i<list.size();i++){
			System.out.println(i+"번지의 값 : "+list.get(i));
		}

		list.remove(0);

		System.out.println("2차테스트");
		for(int i=0;i<list.size();i++){
			System.out.println(i+"번지의 값 : "+list.get(i));
		}
	}
}