package ch08;

//Tv 리모콘
public class InterfaceTest03 implements InterfaceTest01, InterfaceTest02,Runnable{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub.
		System.out.println("A회사에서 사용하는 메소드 -TV를 켤 때는 turnOn");
	}

	@Override
	public void lightOn() {
		// TODO Auto-generated method stub
		System.out.println("B회사에서 사용하는 메소드 -TV를 켤 때는 lightOn");
	}

	public static void main(String args[]){
		InterfaceTest03 it03 = new InterfaceTest03();
		
		/*우리집에는 Tv가 두대가 있다. A회사와 B회사 제품 그래서 리모컨이 각 각 두개이다. 
		리모컨을 만들 때, 각 회사 제품에 맞게 interface를 구현하고 오버라이딩 하였다.
		그래서 turnOn() 메소드를 가진 리모컨과 lightOn() 메소드를 가진 리모컨이 있다. */
		
		//A회사 리모컨을 사용
		it03.turnOn();
		//B회사 리모컨을 사용
		it03.lightOn();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
