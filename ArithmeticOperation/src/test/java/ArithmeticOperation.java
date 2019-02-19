
package test.java;


public class ArithmeticOperation  {
int val;
	public ArithmeticOperation add(int a,int b) throws InterruptedException
	{
		Thread.sleep(1200);
		this.val = a+b;
		return this;
	}
	public ArithmeticOperation subtract(int a, int b)
	{
		this.val = a-b;
		return this;
	}
	public ArithmeticOperation multiply(int a, int b) throws InterruptedException
	{
		Thread.sleep(1700);
		this.val = a*b;
		return this;
	}
	public ArithmeticOperation divide(int a, int b)
	{
		this.val = a/b;
		return this;
	}
	public ArithmeticOperation modus(int a, int b)
	{
		this.val = a%b;
		return this;
	}
}