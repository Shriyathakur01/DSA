class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[][]t=new int[n+1][2];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                if(j==1) t[i][j]=Math.max(-prices[i]+t[i+1][0],t[i+1][1]);
                else t[i][j]=Math.max(prices[i]-fee+t[i+1][1],t[i+1][0]);
            }
        }
        return t[0][1];
    }
}