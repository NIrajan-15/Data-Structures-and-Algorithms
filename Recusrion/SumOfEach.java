package Recusrion;

public class SumOfEach {
    
    public static void main(String[] args)
    {
        int n = 123554;
        
        System.out.print(sum(n));
    }

    static int sum(int n)
    {
        if(n%10==n)
        {
            return n;
        }

        return n%10+sum(n/10);
    }
}
