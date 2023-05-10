package ch11;

public class SystemEx01 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		int arr1[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
    /*	arraycopy (Object  src, int srcPos, Object  dest, int destPos, 
        int length)
		src - 카피할 소스
		srcPos - 카피할 소스의 시작 위치, 인덱스
		dest - 카피받을(?) 객체
		destPos - 카피받을 시작 인덱스
		length - 카피할 길이*/

		System.arraycopy(arr, 0, arr1, 0, 3);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		double start = System.currentTimeMillis();
		for(int i=0; i<1000000000; i++){}
		double end = System.currentTimeMillis ();
		System.out.println((end - start)/1000+"초"); 
		
		System.exit(0);
		System.out.println("출력테스트");
	}
}
