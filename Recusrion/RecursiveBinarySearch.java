package Recusrion;

// Recursive Binary Search in an sorted Ascending Array


// class RecursiveBinarySearch
public class RecursiveBinarySearch {
    public static void main(String[] args)
    {
        //Array that we will search in
        int[] arr = {1,4,6,8,12,33,45,67};
        // target that we will serch for in the array
        int target = 6;
        // Print the return value of the function recBinarySearch
        System.out.println(recBinSearch(0,arr.length-1,target,arr));

    }


    /*
        Static function to call without any objects
        takes the start position, end position, target and the array to search
        return -1 if not found
        return mid value if tatget lies in that index
        if target is small than element in the mid index then return function recBinSearch(i.e. recursion) with changed parameters i.e half of the array
        if the target is larger than element in the mid index then return function recBinSearch(i.e. recursion) with changed parameters i.e half of the array
    */ 
    static int recBinSearch(int start, int end, int target, int[] arr)
    {
        // mid index to check if target is smaller, greater, or equal to mid index element
        int mid = start + (end-start)/2;

        /*
            if not found return -1 
            base condition
        */ 
        if(start>end)
        {
            return -1;
        }
        //if target is found at mid index return mid 
        if(target==arr[mid])
        {
            return mid;
            
        }
        /*
            if target is small than mid indexed element then return itself with end being on first half of the array
            recursive call
        */ 
        if(target<arr[mid])
        {
            return recBinSearch(start,mid-1,target,arr);
        }
        /*
            if target is greater than mid indexed element then return the function itself i.e(recBinSearch) with end being on second half of the array
            recursive call
        */
        else{
            return recBinSearch(mid+1,end,target,arr);
        }

        

    }
}
