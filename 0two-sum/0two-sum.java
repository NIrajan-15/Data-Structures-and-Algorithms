class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length-1;i++)
        {
            map.put(nums[i],i);
        }

        for(int j=0;j<nums.length;j++)
        {
            if(map.keySet().contains(target-nums[j]))
            {
                if(map.get(target-nums[j]) != j )
                {
                    return new int[] {j, map.get(target-nums[j])};
                }
            }
        }
        return new int[2];
    }
}