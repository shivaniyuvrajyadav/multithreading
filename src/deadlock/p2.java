package deadlock;

public class p2 {
	
	public synchronized void demo2(P1 ref) {
		System.out.println("this is demo 2");
		ref.test2();
	}

	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("this is test1");
		
		
	}

	
}
