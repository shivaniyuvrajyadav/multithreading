package deadlock;

public class P1 {
	public synchronized void demo1(p2 ref) {
		System.out.println("this is demo1");
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println("hello");
		}
		ref.test1();
		
	}
	public synchronized void test2() {
		System.out.println("this is test2");
//		notify();
	}

}
