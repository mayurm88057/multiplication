package ThreadCreation;

public class Runthreadinstagram {

	public static void main(String[] args) {
		Instagram i1 =new Instagram("david");
		Instagram i2 =new Instagram("poorva");
		Instagram i3 =new Instagram("newname");
		
		i1.t.start();
		i2.t.start();
		i3.t.start();
}}
 
