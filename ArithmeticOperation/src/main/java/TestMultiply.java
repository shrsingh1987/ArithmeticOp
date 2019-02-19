package main.java;


//import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import main.java.ArithmeticOperation;

public class TestMultiply {
	
	 ArithmeticOperation op = new ArithmeticOperation();
	 ArithmeticOperation op1 = new ArithmeticOperation();
	 long l = 2000;
	 static TestMultiply testing;
	
	 
	public static void main(String[] args) throws InterruptedException 
	{
		
		testing.multiplication();
	
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void multiplication() throws InterruptedException {
		//Thread.sleep(10500);
		int a = 30;
		int b = 10;
		long l1 = System.currentTimeMillis();
		op1 = op.multiply(a,b);
		long l2 = System.currentTimeMillis();
		long l3=l2-l1;
		Assert.assertTrue("Test Passed as it took"+l3+ " secs",l3<l);
		System.out.println("Test Passed as it took"+l3+ " secs");
		
	}
}

