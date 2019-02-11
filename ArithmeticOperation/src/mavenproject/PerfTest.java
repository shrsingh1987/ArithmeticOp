package mavenproject;

import mavenproject.TestMultiply;
import com.clarkware.junitperf.TimedTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



public class PerfTest extends TestCase {

	public static Test suite() 
	{  
		TestSuite suite = new TestSuite();
        TestCase testCase = new TestMultiply("test"); 
        TimedTest timedTest = new TimedTest(testCase, 1500);
        suite.addTest(timedTest);
        TestCase testCase1 = new TestMultiply("test1"); 
        TimedTest timedTest1 = new TimedTest(testCase1, 2500);
        suite.addTest(timedTest1);
		return suite;          
	 }

}
