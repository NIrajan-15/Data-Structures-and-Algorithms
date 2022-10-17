package Recusrion;

public class ReverseaNumber {
    public static void main(String[] args)
    {
        int n = 12345;
        System.out.println(reverse(n,(int)Math.log10(n)));
    }

    static int reverse(int n,int power)
    {
        if(n%10==n)
        {
            return n*(int)Math.pow(10,power);
        }

        return n%10*(int)Math.pow(10,power)+reverse(n/10,power-1);
    }
}
