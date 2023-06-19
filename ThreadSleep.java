package ThreadCreation;

import java.util.concurrent.TimeUnit;

public class ThreadSleep {
public static void main(String[] args) throws InterruptedException {
	
	System.out.println("In main ");
	//Thread.sleep(1000);
	
	TimeUnit.SECONDS.sleep(200);
	System.out.println("main ends");
}
}
