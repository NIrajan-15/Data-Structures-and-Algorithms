package Sort;
import java.util.Arrays;

// Bubble Sort Algorithm 
/*  
   time complextiy: 
      best : O(N^2) 
      worst : O(N^2)

      Worst and best case are same because it checks for every element

      It is not a stable sorting algorithm and performs well on small arrays
   
   space complexity:
      O(1) -> no new arrays are required for copying or whatever
*/

// class selection sort
public class SelectionSort {
    public static void main(String[] args)
    {
        // array to sort
        int[] arr = {1,2,5,6,77,8,9};
        //calling function to sort the array
        sort(arr);
        //print the array
        System.out.println(Arrays.toString(arr));
    }

    /* 
     * Static method sort 
     * Takes integer array arr as parameter
     * Returns the same array but sorted
     */
    static void sort(int[] arr)
    {
        // check for all elements in the array
        for(int i=0;i<arr.length;i++)
        {
            /* last postion till which we have to check
                becuse as loop begins it sorts elements in last indices of the array
             */
            int last = arr.length -i -1;
            int max= getMax(arr, 0, last);
            
                // swap the max element and element in the current index
                int temp = arr[last];
                arr[last] = arr[max];
                arr[max] = temp;
        
        }
    }

    // method find the max element index in certain range of array
    static int getMax(int[] arr, int start, int end)
    {
        int max = start;

        for(int i=start;i<=end;i++)
        {
            // if current element is greater than element in max index then largest elements index would be max
            if (arr[i]>arr[max]){
                max = i;
            }
        }
        //return the index of largerst element
        return max;
    }
}
