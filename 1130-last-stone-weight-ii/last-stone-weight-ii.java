class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum=0;
        int n=stones.length;
        for(int x:stones){
            sum+=x;
        }
        boolean[][]dp=new boolean[n+1][sum/2+1];
        dp[0][0]=true;
        for(int i=1;i<n+1;i++){
            for(int j=0;j<sum/2+1;j++){
                dp[i][j]=dp[i-1][j];
                if(stones[i-1]<=j){
                    dp[i][j]=dp[i-1][j-stones[i-1]]||dp[i-1][j];
                }
            }
        }

        for(int j=sum/2;j>=0;j--){
            if(dp[n][j]) return sum-2*j;
        }
        return 0;
    }
}