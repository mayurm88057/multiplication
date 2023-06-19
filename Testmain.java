package Mutlithread;

public class Testmain {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		
		System.out.println(t);
		t.setName("stock trading app");
		System.out.println(t);
	}

}
