
/**
* Contains one method:
* <ol>
* <li>
* FibIterative is a method that takes an integer,
* and iterates through the Fibonacci series 
* to find that integer's place in the series
* </ol>

* @author Joanna Smith

*/
public class Fibonacci {
   
    public  int FibRecursive(int n){
       
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
