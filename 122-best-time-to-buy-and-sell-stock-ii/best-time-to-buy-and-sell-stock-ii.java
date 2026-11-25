class Solution {
    static int[][]dp;
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        return helper(0,1,prices);
    }


    private int helper(int ind,int buy,int[]arr){
        if(ind==arr.length) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        if(buy==1){
            dp[ind][buy]=Math.max(-arr[ind]+helper(ind+1,0,arr),helper(ind+1,1,arr));
        }
        else dp[ind][buy]=Math.max(arr[ind]+helper(ind+1,1,arr),helper(ind+1,0,arr));
        return dp[ind][buy];
    }
}