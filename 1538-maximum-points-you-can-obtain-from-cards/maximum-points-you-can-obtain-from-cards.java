class Solution {
    public int maxScore(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        for(int i=0;i<k;i++){
            sum-=nums[k-1-i];
            sum+=nums[n-1-i];

            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
        
    }
}