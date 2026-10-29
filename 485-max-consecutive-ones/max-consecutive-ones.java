class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int r=0,l=0;
        int maxlen=0;
        int count=0;
        while(r<nums.length){
            if(nums[r]==1) count++;
            else count=0;
            maxlen=Math.max(count,maxlen);
            r++;
        }
        return maxlen;
    }
}