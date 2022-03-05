/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author joann
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

@Test
    //Verifies Fibonacci.FibRecursive() performs as expected under 'normal' input conditions.
   public void testNormal() {
        Fibonacci fib = new Fibonacci();
      
        System.out.println("***** Run: testNormal *****");
        for(int i = 4; i <= 10;i+=2) {
             System.out.println("The " + i + " number of the Fibonacci series is " + fib.FibRecursive(i));
        }
        
        System.out.println("***** End: testNormal *****");
    }

@Test
    //Verifies Fibonacci.FibRecursive() results in one for a negative number.
    public void testNegativeNumber() {
        Fibonacci fib = new Fibonacci();
        
        int i = -56;
        System.out.println("***** Run: testNegativeNumber *****");
             System.out.println("The " + i + " number of the Fibonacci series is " + fib.FibRecursive(i));
             
        System.out.println("***** End: testNegativeNumber *****");


    }

@Test
    //Verifies  Fibonacci.FibRecursive() outputs 1 if input value is less than 2 but not zero.
     public void testLessThanTwo() {
        Fibonacci fib = new Fibonacci();
        System.out.println("***** Run: testLessThanTwo *****");
        for(int i = -3;i<=2;i++) {
             System.out.println("The " + i + " number of the Fibonacci series is " + fib.FibRecursive(i));
        }
        System.out.println("***** End: testLessThanTwo *****");
    }

@Test
    //Verifies  Fibonacci.FibRecursive() outputs 0 when input value is 0.
    public void testIsZero() {
        Fibonacci fib = new Fibonacci();

        System.out.println("***** Run: testIsZero *****");
        int i = 0;
             System.out.println("The " + i + " number of the Fibonacci series is " + fib.FibRecursive(i));
             
        System.out.println("***** End: testIsZero *****");
    }
    
}
