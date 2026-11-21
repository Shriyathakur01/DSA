class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }

    private int helper(int[]nums,int k){
        if(k<0) return 0;
        int l=0;
        int r=0;
        int count=0;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>k){
                if(nums[l]==1)sum-=1;
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}