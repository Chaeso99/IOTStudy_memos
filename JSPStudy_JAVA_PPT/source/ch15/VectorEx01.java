package ch15;

import java.util.Vector;

public class VectorEx01 {
	public static void main(String[] args) {

		Vector vc = new Vector<>();

		System.out.println(vc.capacity());
		System.out.println(vc.size());

		vc.add("하하");
		vc.add(1);
		vc.add(true);
		vc.add(new StringBuffer("히히"));
		System.out.println(vc.capacity());
		System.out.println(vc.size());

		for (int i = 0; i < vc.size(); i++) {
			Object obj = vc.get(i); 
			System.out.println(obj);
		}
	}
}