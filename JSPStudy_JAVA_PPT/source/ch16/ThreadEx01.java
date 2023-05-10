package ch16;

class Thread01 extends Thread {
	
	String name;
	
	public Thread01(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(20);
				System.out.println(name + " : "  + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx01{
	public static void main(String[] args) {
		Thread01 t1 = new Thread01("첫번째");
		Thread01 t2 = new Thread01("두번째");
		t1.start();
		t2.start();
	}
}