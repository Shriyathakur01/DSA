class Solution {
    public int maxProfit(int k,int[] prices) {
        int n=prices.length;
        int[][][]t=new int[n+1][2][k+1];
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<2;buy++){
                for(int cap=1;cap<k+1;cap++){
                    if(buy==1){
                        t[ind][buy][cap]=Math.max(-prices[ind]+t[ind+1][0][cap],t[ind+1][1][cap]);
                    }
                    else t[ind][buy][cap]=Math.max(prices[ind]+t[ind+1][1][cap-1],t[ind+1][0][cap]);
                }
            }
        }
        return t[0][1][k];
    }
}