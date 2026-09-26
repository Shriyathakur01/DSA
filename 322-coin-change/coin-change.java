class Solution {
    public int coinChange(int[] coins, int sum) {
        int n=coins.length;
        int[][]t=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            t[i][0]=0;
        }
        for(int j=1;j<sum+1;j++){
            t[0][j]=Integer.MAX_VALUE-1;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coins[i-1]<=j){
                    t[i][j]=Math.min(1+t[i][j-coins[i-1]],t[i-1][j]);
                }
                else t[i][j]=t[i-1][j];
            }
        }
        if(t[n][sum]==Integer.MAX_VALUE-1) return -1;
        return t[n][sum];
    }
}