package Sort;
import java.util.Arrays;

// Cyclic Sort Algorithm


/*  
   time complextiy: 
      best : O(N) -> If the arrays is in ascending order or (already sorted)
      worst : O(N)-> If the array is in descending order
   
   space complexity:
      O(1) -> no new arrays are required for copying or whatever
*/

//class CyclicSort
public class CyclicSort {
    public static void main(String[] args)
    {
        // Array to be sorted
        int[] arr = {1,3,2};
        System.out.println(Arrays.toString(sort(arr)));
        
    }

    /* 
     * Static method sort 
     * Takes integer array arr as parameter
     * Returns the same array but sorted
     */
    static int[] sort(int[] arr)
    {
        // traverse through all elements
        for(int i=0;i<arr.length;i++)
        {
            /*
             * for the array to be sorted index 0 must 1, index 1 holds 2 and so on
             * if the value doesn't match the index then place then swap it with element in current values index
             * The value of I won't increase if true and program with begin at same index
            */
            if(arr[i] != i+1)
            {
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
                i--;
                
            }
        }
        //return the sorted array
        return arr;
    }
}
