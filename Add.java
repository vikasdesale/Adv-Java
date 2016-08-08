class Add implements Runnable
{
	int a, b;

	Thread t;
	Add(int x, int y)
	{
		a = x;
		b = y;
		Thread t = new Thread(this, "Add");
		t.start();
	}
	public void run()
	{
		int c = a + b;
		try
		{
			t.sleep(1000);
			System.out.println("Addition of two numbers is : " + c);
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class Subtract implements Runnable
{
	int a, b;
	Thread t;
	Subtract(int x, int y)
	{
		a = x;
		b = y;
		Thread t = new Thread(this, "Add");
		t.start();
	}
	public void run()
	{
		int c = a - b;
		try
		{
			t.sleep(1000);
			System.out.println("Subtraction of two numbers is : " + c);
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class Pract18 
{
	public static void main(String[] args) 
	{
		Add a = new Add(15, 10);
		Subtract s = new Subtract(15, 10);
	}
}
/*
// output
Addition of two numbers is : 25
Subtraction of two numbers is : 5
*/