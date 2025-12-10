class Solution {
    public boolean canJump(int[] nums) {
        int end=nums[0];
        int st=0;
        for(int i=st;i<=end;i++)
        {
            if(i>=nums.length-1)
            {
                return true;
            }
            else
            {
                end=Math.max(end,nums[i]+i);
            }
        }
        return false;
    }
}