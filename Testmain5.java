package Mutlithread;

public class Testmain5 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
 System.out.println("status of main= "+ t.isDaemon());
 
 try {
 t.setDaemon(true);
 }
catch(java.lang.IllegalThreadStateException e) {
	System.out.println("error");

}
System.out.println("status of main after" + t.isDaemon());
 System.out.println("end of main");
}}
