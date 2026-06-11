class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=nums[j]; 
                if(sum>max) max=sum;
                if(sum<0) sum=0;
            }
        return max;
    }
}