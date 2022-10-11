package Sort;

// Bubble Sort Algorithm 
/*  
   time complextiy: 
      best : O(N) -> If the arrays is in ascending order or (already sorted)
      worst : O(N^2)-> If the array is in descending order
   
   space complexity:
      O(1) -> no new arrays are required for copying or whatever
*/

// import arrays

import java.util.Arrays;


// Class BubbleSort
public class BubbleSort{

   public static void main(String[] args)
   {
      int[] arr = {1,3,5,4,7,8,9,12,14,77,90};
      sortalgo(arr);// sort the array
      System.out.println(Arrays.toString(arr)); // print array
      
   
   }
   
   /* 
     * Static method sort 
     * Takes integer array arr as parameter
     * Returns the same array but sorted
     */
   static void sortalgo(int[] arr)
   {
      boolean sort;
      // outer loop to check every element
      for(int i=0;i<arr.length;i++)
      {
            sort = true;
         /*
            Number of times inner loop runs reduce in each iteration as 
            the largest number would be swapped to end of array in ascending order
         */
         for(int j=0;j<arr.length-i-1;j++)
         {
            if(arr[j]>arr[j+1])
            {
               /* Swapping if next element in the next index in array is smaller than current index element*/ 
                int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
               sort = false;
            }
         }
         /* if we didn't had to sort for that element in first position then 
            we don't have to check for others
         */ 
         if(!sort)
         {
            break;
         }
      }
      
   } 
   
}