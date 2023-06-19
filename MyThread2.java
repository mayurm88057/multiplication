package MutliTHreading;

import java.util.concurrent.Callable;

public class MyThread2 implements Callable<Integer>{


	
	@Override
	public Integer call() throws Exception
	{
		return 100;
	}
	
}

