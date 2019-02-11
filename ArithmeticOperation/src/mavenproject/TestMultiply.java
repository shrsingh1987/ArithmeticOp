package mavenproject;

import mavenproject.ArithmeticOperation;

//import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import junit.framework.TestCase;

public class TestMultiply extends TestCase {
	ArithmeticOperation op = new ArithmeticOperation();
	ArithmeticOperation op1 = new ArithmeticOperation();
	int a = 40;
	int b = 10;
	
	public TestMultiply(String value) {
        super(value);
    }
	
	public static void main(String[] args) throws InterruptedException 
	{
		Thread.sleep(10500);
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		//Thread.sleep(10500);
		op1 = op.multiply(a,b);
		if ( op1.val == 0 )
		{
			Thread.sleep(500);
		fail();
		}
		else
		{
			Thread.sleep(1000);
			//System.out.println("Value of Operation = " + op1.val);
		}
	}
	@Test
	public void test1() throws InterruptedException {
		//Thread.sleep(10500);
		
		op1 = op.add(a,b);
		if ( op1.val == 0 )
		{
			Thread.sleep(500);
		fail();
		}
		else
		{
			Thread.sleep(1000);
			//System.out.println("Value of Operation = " + op1.val);
		}
	}
}

