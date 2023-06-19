package ThreadCreation;

public class whatsapp implements Runnable{

	Thread t;
	
	
	public whatsapp() {
   t= new Thread(this);
   
	}


	@Override
	public void run() {
System.out.println("Message on whtasapp");

	}
	

}
