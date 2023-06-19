package Mutlithread;

import MutliTHreading.MyThread1;

public class Testmain6 {
	public static void main(String[] args) {
		MyThread1 m = new MyThread1();
		System.out.println(m.isDaemon());
		m.setDaemon(true);
		System.out.println(m.isDaemon());
		m.start();
		System.out.println("end of main");

	}

}
