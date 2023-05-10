package ch16;

class NoThread02 {

	String name;

	public NoThread02(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(20);
				System.out.println(name + " : " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void start() {
		run();
	}
}

public class ThreadEx02 {

	public static void main(String[] args) {
		NoThread02 nt1 = new NoThread02("First");
		NoThread02 nt2 = new NoThread02("Second");
		nt1.start();
		nt2.start();
	}
}
