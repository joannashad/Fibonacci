
public class Main {

    public static void main(String[] args) {
         int N = 15;
        int fibI;
        fibI = FibRecursive(N);
        System.out.println("The " + N + " number of the Fibonacci series is " + fibI);
    }

    /**

* <p>
* FibRecursive is a method that also takes an integer,
* recursively searches for that integer's place in the series.

* @author Joanna Smith
* @param  n  an integer value signifying the user's 
*            requested place in the Fibonacci series
* @return    an integer value selecting the chosen
*            place in the Fibonacci series
*/  


    public static int FibRecursive(int n){
       
        int fib=0;
        if ((n == 0) || (n == 1))
           fib=n;
        else if(n<=0)
            fib=1;
        else
           fib= FibRecursive(n - 1) + FibRecursive(n - 2);
        return fib;
    } 
}
