package com.vinay.Calculator_Operations;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.vinay.Calculator_Operations.Services.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	private static App app = new App(new CalculatorServiceImplementation());;
	
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
   public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    

    /**
     * Rigourous Test :-)
     */
    
    public void testApp()
    {
    	assertEquals(4.0, app.performCalculation(2, 2, '+'), 0.0);
    	assertEquals(-100.0, app.performCalculation(-112, -12, '-'), 0.0);
    	assertEquals(68.0, app.performCalculation(4, 17, '*'), 0.0);
    	assertEquals(1.5, app.performCalculation(6, 4, '/'), 0.0);
    	
    } 
    
}