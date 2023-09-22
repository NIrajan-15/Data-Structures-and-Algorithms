class Solution {
    public int removeElement(int[] nums, int val) {
        //[3,2,2,3]
        int position = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[position] = nums[i];
                position++;
            }
        }
        return position;
    }
}