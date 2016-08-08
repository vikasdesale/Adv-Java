
public class Caller implements Runnable{
	Thread t;
	String message;
	Callme target;
	
	public Caller(String message, Callme tar) {
		// TODO Auto-generated constructor stub
		
		this.message = message;
		target = tar;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		synchronized(target){
		target.call(message);
		}
		
	}

}
