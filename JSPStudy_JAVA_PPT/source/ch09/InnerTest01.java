package ch09;

class Outer01{
	
	int i = 22;
	
	void p(){
		System.out.println("i : " + i);
	}

	class Inner01{
		int j = 23;
		void m(){
			System.out.println("i+j : " + (i+j));
			p();
		}
	}
	
}

public class InnerTest01 {
	public static void main(String[] args) {
		Outer01 out = new Outer01();
		Outer01.Inner01 inner = out.new Inner01();
		inner.m();
	}
}