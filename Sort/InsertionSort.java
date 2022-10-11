package Sort;
import java.util.Arrays;

// Insertion Sort Algorithm


/*  
   time complextiy: 
      best : O(N) -> If the arrays is in ascending order or (already sorted)
      worst : O(N^2)-> If the array is in descending order
   
   space complexity:
      O(1) -> no new arrays are required for copying or whatever
*/


//public class InerstionSort
public class InsertionSort {
    public static void main(String[] args)
    {
        // Array to be sorted
        int[] arr = {4,5,1,2,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    /* 
     * Static method sort 
     * Takes integer array arr as parameter
     * Returns the same array but sorted
     */
    static int[] sort(int[] arr)
    {
        // To loop until second last element
        for(int i=0;i<arr.length-1;i++)
        {
            // traverse array in reverse to find smaller elements
            for(int j=i+1;j>0;j--)
            {
                
                // if element is smaller than its previous one then swap them
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    
                }
                // if element is greater than its previous one then break
                else{
                    break;
                }
            }
        }
        //return the sorted beautiful array
        return arr;
    }
}
