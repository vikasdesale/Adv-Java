
public class TMain {
	public static void main(String...args){
		Callme target = new Callme();
		Caller ob1 = new Caller("Hello", target);
		Caller ob2 = new Caller("This", target);
		Caller ob3 = new Caller("Day", target);
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
