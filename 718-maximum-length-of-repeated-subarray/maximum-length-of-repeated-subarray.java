class Solution {
    static int[][]dp;
    public int findLength(int[] nums1, int[] nums2) {
        int i=nums1.length;
        int j=nums2.length;
        dp=new int[i+1][j+1];
        return helper(nums1,nums2,i,j);
    }

    private int helper(int[]n1,int[]n2,int m,int n){
        int ans=0;
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0|| j==0) dp[i][j]=0;
                else if(n1[i-1]==n2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(ans,dp[i][j]);
                }
                else dp[i][j]=0;
            }
        }
        return ans;
    }
}