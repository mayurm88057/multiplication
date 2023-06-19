package Mutlithread;

public class Testmain4 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();

      ThreadGroup grp=t.getThreadGroup();
      while(grp.getParent()!=null) {
    	  grp=grp.getParent();
      }
      
      grp.list();
	}

}
