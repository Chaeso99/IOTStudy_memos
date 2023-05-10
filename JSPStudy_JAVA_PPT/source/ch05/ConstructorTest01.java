package ch05;

public class ConstructorTest01 {
	public static void main(String[] args) {
		//CstTest01 ct = new CstTest01(); //오류
		CstTest01 ct = new CstTest01("최주호","01022227X6X");
		ct.use();
	}
}

class CstTest01 {

	String name;
	String number;

	public CstTest01(String name, String number) {
		this.name = name;
		this.number = number;
	}
	void use(){
		System.out.println("이름은 "+name+"\n"+"전화번호는 "+number);
	}
}