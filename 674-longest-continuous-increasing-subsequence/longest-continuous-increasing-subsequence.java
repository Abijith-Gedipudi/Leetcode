class Solution {
    public int findLengthOfLCIS(int[] nums) {
       int cnt=1;
       int res=1;
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i]>nums[i-1])
        {
            cnt++;
            res=Math.max(res,cnt);
        }
        else{
            cnt=1;
        }
       }
       return res; 
    }
}