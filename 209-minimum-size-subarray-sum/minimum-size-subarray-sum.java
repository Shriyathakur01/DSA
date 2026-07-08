class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int windowsum=0;
        int res=Integer.MAX_VALUE;
        for(right=0;right<nums.length;right++){
            windowsum+=nums[right];

            while(windowsum>=target){
                res=Math.min(res,right-left+1);
                windowsum-=nums[left++];
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}