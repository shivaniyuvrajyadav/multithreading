package deadlock;



public class Driver extends Thread{
  P1 ref1 = new P1();
  p2 ref2 = new p2();
@Override
  public void run() {
	  ref1.demo1(ref2);
  }
  
  public void m1() {
	  start();
	  ref2.demo2(ref1);
	  
  }
  public static void main(String[] args) {
	 Driver d = new Driver();
	 d.m1();
}
}
