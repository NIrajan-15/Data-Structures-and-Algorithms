package Recusrion;

// Bubble Sort Algorithm Using Recursion
/*  
   time complextiy: 
      best : O(N) -> If the arrays is in ascending order or (already sorted)
      worst : O(N^2)-> If the array is in descending order
   
   space complexity:
      O(1) -> no new arrays are required for copying 
*/

// import arrays
import java.util.Arrays;
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,5,6,3,8,9,11,45,-8};
        System.out.println(Arrays.toString(sort(arr,0,0)));

    }


    static int[] sort(int[]arr, int i,int j)
    {
        // base condition 
        if(i==arr.length-1)
        {
            return arr;
        }

        // to sort the last index
        if(j<arr.length-i-1)
        {
            // sorting the largest element in the sub array
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            //increase the index to sort largest at end index
            return sort(arr,i,j+1);
        }
        
        // to sort unitl i reaches the end index of the array
        return sort(arr,i+1,0);
        
        
        
    }
}