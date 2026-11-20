class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0;
        int zeros=0;
        int max=0;
        while(r<nums.length){
            if(nums[r]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0) zeros--;
                l++;
            }
            if(zeros<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}