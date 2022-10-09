package BinarySearch;

// Binary Search Algorithm for Sorted Ascending Array
/*  
   time complextiy: 
      best : O(1) -> If the target element is the middle element of the array
      worst : O(logN)-> If the target is smallest or largest
   
   space complexity:
      O(1) -> no new arrays are required for copying or whatever
*/

public class BinarySearchAscending {
    public static void main(String[] args)
    {
        // the array in which we will search
        int[] arr = {1,2,3,4,7,8,12,55,88};

        // target we are search for in the array
        int target = 88;

        // print the index of the target
        System.out.print(search(arr,target));
    }

    /* static method to accesss without any objects
       takes array arr to search target in that array.  
    
    */ 
    
    static int search(int[] arr, int target)
    {
        // start and end postion to reduce the size of the array in each iteration 
        int start = 0;
        int end = arr.length-1;

        // break the loop after checking last element
        while(start<=end)
        {
            // middle position to reduce the array size in half
            int mid = start + (end-start)/2;

            // if middle element is target then return mid i.e. index of target
            if(arr[mid]==target)
            {
                return mid;
            }
            //if target is smaller than middle element then end index would be mid-1 i.e. size of array would be first half of the array
            if(target<arr[mid])
            {
                end = mid-1;
            }
            //if target is greater than middle element then end index would be mid+1 i.e. size of array would be second half of the array
            else{
                start= mid+1;
            }

        }
        //if target is not found then return 0;
        return -1;

    }
}
