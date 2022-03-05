import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The following tests the functions 
 * within the Fibonacci application
 * 
 * @author Joanna Smith
 */
class UnitTest  {
    
    public UnitTest() {
    }
    
    @BeforeAll
    static void initAll() {
    } 
   @BeforeEach
    void init() {
    }
   @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }
@Test
    //Verifies Fibonacci.FibRecursive() performs as expected under 'normal' input conditions.
    void testNormal() {
        Fibonacci fib = new Fibonacci();
        String message="";
        
        for(int i = 4; i <= 10;i+=2) {
            assertEquals(i, fib.FibRecursive(i));
        }
    }

@Test
    //Verifies Fibonacci.FibRecursive() results in one for a negative number.
    void testNegativeNumber() {
        Fibonacci fib = new Fibonacci();
        String message="";
        int output = 1;
        
        int i = -56;
            assertEquals(i, fib.FibRecursive(i));


    }

@Test
    //Verifies  Fibonacci.FibRecursive() outputs 1 if input value is less than 2 but not zero.
     void testLessThanTwo() {
        Fibonacci fib = new Fibonacci();
        String message="";
        int output = 1;
        
        for(int i = -3;i<=2;i++) {
            assertEquals(i, fib.FibRecursive(i));
        }
    }

@Test
    //Verifies  Fibonacci.FibRecursive() outputs 0 when input value is 0.
     void testIsZero() {
        Fibonacci fib = new Fibonacci();
        String message="";
        int output = 0;

        int i = 0;
            assertEquals(i, fib.FibRecursive(i));
    }
    

    
   
}
