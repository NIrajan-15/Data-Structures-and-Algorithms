package Recusrion;

public class Practice {
    public static void main(String[] args)
    {
        //recursion to print n numbers  
        int n = 5;

        // call the function print1
        print1(1,n);
        
    }


    //function print1 which takes a and n. a=number i.e. 1,2.3...n. 
    static void print1(int a, int n)
    {
        /*
         * Base case i.e. The recursive function call wil stop 
         * Stop the recursive function calls when your desired target is found
        */
        if(a==n)
        {
            //print the number if it is the limit
            System.out.println(a);
            // return i.e. the receusive calls stop because print1 returns void
            return;
        }
        
        // print the number
        System.out.println(a);

        //same function being called inside print1 function 
        // this is recursion. value of  a is increase and n is the limit.
        print1(a+1, n);
    }

    

}
