class Solution {
    Boolean [][]dp;
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int x:nums){
            sum+=x;
        }

        dp=new Boolean[n+1][sum+1];
        if(sum%2==1) return false;
        int target=sum/2;
        return helper(nums,n,target);
    }

    private boolean helper(int[]nums,int n,int sum){
        if(sum==0) return true;
        else if(n==0) return false;
        else if(dp[n][sum]!=null) return dp[n][sum];
        else if(nums[n-1]>sum){
            dp[n][sum]=helper(nums,n-1,sum);
        }
        else{
            dp[n][sum]=helper(nums,n-1,sum-nums[n-1])||helper(nums,n-1,sum);
        }
        return dp[n][sum];
    }
}