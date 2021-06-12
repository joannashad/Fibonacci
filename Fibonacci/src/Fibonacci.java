
public class Fibonacci {

        protected long startTime = System.nanoTime();
        private long endTime = startTime;
        protected long processTime ;
        protected int fibNum = 0;
        
    public int FibIterative(int n){
        int[] fibArray;
        // allocates memory for up to n values
        fibArray = new int[n+1];
           
        // initialize first and second values of the fibonacci series
        fibArray[0] = 0;
        fibArray[1] = 1;
        //otherwise do the calculation
        for(int i=2; i<=n; i++){        
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
        
        int fib = fibArray[n];
        //grab the end time
        endTime = System.nanoTime();
        //calculate the process time
        //the start time is grabbed before the 
        //first instance os the method is run
        processTime=endTime-startTime;
        return fib;
        
    }
    public int FibRecursive(int n){
       
        int fib=0;
        if ((n == 0) || (n == 1))
           fib=n;
        else
           fib= FibRecursive(n - 1) + FibRecursive(n - 2);
        //grab the end time
        endTime=System.nanoTime();
        //calculate the process time
        //the start time is grabbed before the 
        //first instance os the method is run
        processTime=endTime-startTime;
        return fib;
    }
}
