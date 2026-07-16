class Solution {
    public int longestSubarray(int[] nums) {
        int r=0,l=0;
        int maxcount=0;
        int ans=0;
        int zero=0;
        while(r<nums.length){
            if(nums[r]==0) zero++;
            while(zero>1){
                if(nums[l]==0) zero--;
                l++;
            }
            ans=Math.max(ans,r-l);
            r++;
        }
        return ans;
        
    }
}