package ch03;

public class BreakTest01 {
	public static void main(String args[]){
		int n = 7;
		//while문을 사용하여 7보다 작은 수만 출력하라
		int i=1;
		while(true){
			if(i==7) break;
			System.out.println(i);
			i++;
		}
	}
}