package ch03;
public class IfTest03 {
	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		if ((x>y) || (x==9)){
			System.out.println("Âü");
		} else{
			System.out.println("°ÅÁş");
		}
		if ((x>y) && (x==9)){
			System.out.println("Âü");
		} else{
			System.out.println("°ÅÁş");
		}
	}
}
