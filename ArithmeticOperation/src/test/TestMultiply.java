package mavenproject;

import mavenproject.ArithmeticOperation;

//import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import junit.framework.TestCase;

public class TestMultiply extends TestCase {
	
	static ArithmeticOperation op = new ArithmeticOperation();
	static ArithmeticOperation op1 = new ArithmeticOperation();
	static long l = 2000;
	
	public TestMultiply(String value) {
        super(value);
    }
	
	public static void main(String[] args) throws InterruptedException 
	{
		int a = 30;
		int b = 10;
		multiply(a,b);
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public static void multiply(int a, int b) throws InterruptedException {
		//Thread.sleep(10500);
		long l1 = System.currentTimeMillis();
		op1 = op.multiply(a,b);
		long l2 = System.currentTimeMillis();
		long l3=l2-l1;
		assertTrue("Test Passed as it took"+l3+ " secs",l3<l);
		System.out.println("Test Passed as it took"+l3+ " secs");
		
	}
}

