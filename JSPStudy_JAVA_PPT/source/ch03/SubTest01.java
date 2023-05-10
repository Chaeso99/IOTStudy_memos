package ch03;
public class SubTest01 {
	public static void main(String[] args) {
		int x; //변수 선언
		int y; //변수 선언
		x = 10; //변수 초기화
		y = x; //변수 초기화 상수가 아닌 변수를 대입한다.
		int c; //변수 선언
		//y = c; 오류 초기화 되지 않은 값을 변수에 대입할 수 없다.
		//3 = x; 오류 상수에 변수를 대입할 수 없다.
		System.out.println(x); //x값
		System.out.println(y); //y값
		//System.out.println(c); 초기화 되지 않는 변수는 화면에 출력할 수 없다.
	}
}