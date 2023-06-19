package ThreadCreation;

public class Telegram implements Runnable {

	
	Thread t;
	public Telegram() {
		t = new Thread(this," this is telegram thread");
	}
	@Override
	public void run() {
    System.out.println("messaging on whatsapp using thread" + t.getName());		
	}

	
}


