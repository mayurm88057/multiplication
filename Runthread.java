package ThreadCreation;

public class Runthread {

	public static void main(String[] args) {
		sms s1 = new sms();
		Thread t1 = new Thread(s1);
		
		Thread t2 =new Thread(new sms());
		t1.start();
		t2.start();

	}
}
