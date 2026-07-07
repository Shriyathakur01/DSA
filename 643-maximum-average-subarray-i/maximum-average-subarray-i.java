class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int windowsum=0;
        int maxavg=Integer.MIN_VALUE;

        for(int right=0;right<nums.length;right++){
            windowsum+=nums[right];

            if(right-left+1==k){
                maxavg=Math.max(maxavg,windowsum);
                windowsum-=nums[left];
                left++;
            }
        }
        return (double)maxavg/k;
        
    }
}