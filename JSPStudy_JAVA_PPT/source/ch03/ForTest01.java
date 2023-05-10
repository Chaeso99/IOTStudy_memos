package ch03;
public class ForTest01 {
	public static void main(String[] args) {
		for(int i=1; i<10; i+=10){
			System.out.println(i);   //println은 내려쓰기 하면서 출력하는 것
		}
		int j;
		for(j=1; j<10; j++){
			System.out.print(j+" "); //print는 내려쓰기 없이 출력하는 것
		}
		System.out.println(); //내려쓰기를 위해서
		System.out.println("for문이 끝난 뒤 j의 값 : "+j);
		for(int i=1; i<10; ++i){
			System.out.print(i+" ");
		}
	}
}