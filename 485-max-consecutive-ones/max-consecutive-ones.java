class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0,r=0;
        int max=0;
        int count=0;
        while(r<nums.length){
            if(nums[r]==1) count++;
            else if(nums[r]==0) count=0;
            max=Math.max(max,count);
            r++;
        }
        return max;
    }
}