class Solution {
    public int jump(int[] nums) {
        int total_jump=0;
        int destination=nums.length-1;
        int maximum_reach=0;
        int last_jump_index=0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length-1;i++)
        {
            maximum_reach=Math.max(maximum_reach,i+nums[i]);
            if(i==last_jump_index)
            {
            last_jump_index=maximum_reach;
            total_jump++;
            }
        }
            if(maximum_reach>=destination)
            {
                return total_jump;
            }
     return total_jump;
    }
}
