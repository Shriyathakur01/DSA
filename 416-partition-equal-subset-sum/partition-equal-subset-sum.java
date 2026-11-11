class Solution {
    static boolean[][]dp;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        if(sum%2!=0) return false;
        int n=nums.length;
        int target=sum/2;
        dp=new boolean[n+1][target+1];
        return helper(nums,n,target);
    }

    private boolean helper(int[]nums,int n,int target){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                if(j==0) dp[i][j]=true;
                else if(i==0)dp[i][j]=false;
                else if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j-nums[i-1]]||dp[i-1][j];
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][target];
    }
}