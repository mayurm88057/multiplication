package ThreadCreation;
// using try catch 

import java.util.concurrent.TimeUnit;

public class ThreadSleep2 {
public static void main(String[] args){
	
	System.out.println("In main ");
	
	try {
		Thread.sleep(1000);
		//TimeUnit.SECONDS.sleep(2);
	}catch (Exception e) {

		
	}
	System.out.println("main ends");	
}
}
