package Recusrion;

// FInd the nth finbonacci number using recursion
public class Fibonacci{
    public static void main(String[] args)
    {
        System.out.println(fibo(8));
    }

    // function to find the fibonacci number
    static int fibo(int n)
    {
        /*
            Base case
         * if n==2  then return the number itself because 1st and 2nd element of fibonacci seq are 0 and 1.
         * else call the fibo function for n-1 and n-2. (recursion)
         * 
        */
        if(n<2)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}