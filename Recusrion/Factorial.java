package Recusrion;

/* Find Factorail of a number using Recursion */


public class Factorial {
    public static void main(String[] args)
    {
        //find the factorial of 5
        int n = 5;
        //print return value when 5 is passed to factorial
        System.out.println(factorial(n));
    }

    /* 
     *  
     * Takes integer n as parameter i.e the number whose factorial is to be calculated
     * Returns factorial of n
     */    
    static int factorial(int n)
    {
        
        /*
         * Base case 
         * 
        */
        if(n==2)
        {
            return 2;
        }
        
        //return n*facotiral of n-1
        return n*factorial(n-1);
        
        
        
        
    }
}
