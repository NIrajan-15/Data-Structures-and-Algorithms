
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
   
   // This metohd is static because it doesn't belong to any class.
   static void sortalgo(int[] arr)
   {
      
      
      for(int i=0;i<arr.length;i++)
      {
         for(int j=0;j<arr.length-i-1;j++)
         {
            if(arr[j]>arr[j+1])
            {
               /* Swapping if next element in the next index in array is smaller than current index element*/ 
                int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
         }
      }
      
   } 
   
}