
// Binary Search Algorithm for Sorted Descending Array
/*  
   time complextiy: 
      best : O(1) -> If the target element is the middle element of the array
      worst : O(logN)-> If the target is smallest or largest
   
   space complexity:
      O(1) -> no new arrays are required for copying or whatever
*/

public class BinarySearchDescending {
    public static void main(String[] args)
    {
        // the array in which we will search
        int[] arr = {88,44,55,7,2,1};

        // target we are search for in the array
        int target = 1;

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
                start = mid+1;
            }
            //if target is greater than middle element then end index would be mid+1 i.e. size of array would be second half of the array
            else{
                end= mid-1;
            }

        }
        //if target is not found then return -1;
        return -1;

    }
}
