package ch11;

public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Java");
		System.out.println(sb);
		sb.append(" Programming");
		System.out.println(sb);
		sb.replace(0, 4, "Android");
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}