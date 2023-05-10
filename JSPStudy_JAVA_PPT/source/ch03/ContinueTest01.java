package ch03;

public class ContinueTest01 {

	public static void main(String[] args) {
		//숫자 3은 출력하지 말아라
		for(int i=1; i<=5; i++){
			if (i==3){
				continue;
			}
			System.out.println(i);
		}
	}
}