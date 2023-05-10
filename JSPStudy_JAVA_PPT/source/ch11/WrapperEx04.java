package ch11;

public class WrapperEx04 {
	public static void plus(int i, int j){
		int sum =i+j;
		System.out.println("sum : "+ sum);
	}
	
	public static void plus(int i, int j, int k){
		int sum =i+j+k;
		System.out.println("sum : "+ sum);
	}
	
	public static void plus(int[] arr){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("sum : "+ sum);
	}
	
	public static void vplus(int...arr){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("sum : "+ sum);
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		plus(10,20);
		plus(10,20,30);
		plus(arr);
		vplus(10,20);
		vplus(10,20,30,40,50,60);
	}
}