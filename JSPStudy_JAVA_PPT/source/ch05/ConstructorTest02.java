package ch05;

public class ConstructorTest02 {

	public static void main(String[] args) {
		CstTest02 ct1 = new CstTest02("최주호");
		ct1.use();
		CstTest02 ct2 = new CstTest02(10000);
		ct2.use();
		CstTest02 ct3 = new CstTest02("최주호",10000);
		ct3.use();
	}
}

class CstTest02 {
	String name;
	int money;
	public CstTest02() {
		
	}
	public CstTest02(String name) {
		this.name = name;
	}
	public CstTest02(int money) {
		this.money = money;
	}
	public CstTest02(String name, int money) {
		this.name = name;
		this.money = money;
	}
	void use(){
		System.out.println("이름은 "+name+"\n"+"재산은 "+money+"\n");
	}
}