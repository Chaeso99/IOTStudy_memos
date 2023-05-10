package ch15;

import java.util.Vector;

public class VectorEx02 {
	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();

		vc.add("정동진"); 
		vc.add("김영진"); 
		vc.add("최주호"); 
		vc.add("원빈"); 
		vc.add("전지현"); 

		System.out.println(vc.size()); 
		vc.remove(1); 
		vc.remove("원빈"); 
		System.out.println(vc.size()); 

		for (int i = 0; i < vc.size(); i++) { 
			System.out.println(vc.get(i)); 
		}
		if(vc.contains("전지현")){ 
			int idx = vc.indexOf("전지현");
			System.out.println(idx); 
		}else{ 
			System.out.println("해당 요소가 없다."); 
		}
		vc.removeAllElements();
		if(vc.isEmpty()){
			System.out.println("요소가 없다."); 
		}
	}
}