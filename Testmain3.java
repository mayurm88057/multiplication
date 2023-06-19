package Mutlithread;

public class Testmain3 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();

      ThreadGroup grp=t.getThreadGroup();
      
      grp.list();
	}

}
