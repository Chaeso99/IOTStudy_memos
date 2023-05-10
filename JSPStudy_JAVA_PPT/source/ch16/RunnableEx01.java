package ch16;

public class RunnableEx01 implements Runnable{
	
	String name;
	
	public RunnableEx01(String name) {
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
	
	public static void main(String[] args) {
		RunnableEx01 r1 = new RunnableEx01("첫번째");
		RunnableEx01 r2 = new RunnableEx01("두번째");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}