import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        int position = 0;
    for(int i=0;i<nums.length;i++)
    {
        if(set.add(nums[i]))
        {
            nums[position] = nums[i];
            position++;
        }
    }
        return position;
        
    }
}