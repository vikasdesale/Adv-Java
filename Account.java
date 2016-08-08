class Account implements Runnable
{
	int balance;
	Thread t;
	Account(int b)
	{
		balance = b;
		t = new Thread(this, "Account thread");
		t.start();
	}
	@SuppressWarnings("static-access")
	public void run()
	{
		try
		{
			balance = Deposite(balance);		
			t.sleep(1000);
			System.out.println("Balance in the account is : " + balance);
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
	}
	synchronized int Deposite(int a)
	{
			a += 10;
			return a;
	}
}
class Pract19 
{
	public static void main(String[] args) 
	{
		Account a1 = new Account(100);
		Account a2 = new Account(200);
		Account a3 = new Account(300);
		Account a4 = new Account(400);
		Account a5 = new Account(500);
		try
		{
			a1.t.join();
			a2.t.join();
			a3.t.join();
			a4.t.join();
			a5.t.join();
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Main thread exiting");
	}
}
/*
// Output
Balance in the account is : 310
Balance in the account is : 410
Balance in the account is : 510
Balance in the account is : 210
Balance in the account is : 110
Main thread exiting
*/