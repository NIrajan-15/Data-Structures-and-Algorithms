package Leetcode;

// Find the missing number in array of unique integers in range [0,n] and length of array = n-1;


public class MissingNumber {

    public static void main(String[] args)
    {
        int[] arr = {0,9,6,3,4,5,1,2,8};
        System.out.println(findMissing(arr));
    }

    

    static int findMissing(int[] arr)
    {
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            if(arr[i] != i && arr[i] != len)
            {
                
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
                i--;
                
            }
        }

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] != j)
            {
                return j;
            }
        }
        return len;
    }
    
}
