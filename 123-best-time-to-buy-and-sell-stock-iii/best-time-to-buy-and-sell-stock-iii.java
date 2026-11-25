class Solution {
    static int[][][]t;
    public int maxProfit(int[] prices) {
        int n=prices.length;
        t=new int[n][2][3];
        for(int[][]mat:t){
            for(int[]row:mat){
                Arrays.fill(row,-1);
            }
        }
        return helper(0,1,2,prices);
    }

    private int helper(int ind,int buy,int cap,int[]arr){
        if(ind==arr.length || cap==0) return 0;
        if(t[ind][buy][cap]!=-1) return t[ind][buy][cap];
        if(buy==1) t[ind][buy][cap]=Math.max(-arr[ind]+helper(ind+1,0,cap,arr),helper(ind+1,1,cap,arr));
        else t[ind][buy][cap]=Math.max(arr[ind]+helper(ind+1,1,cap-1,arr),helper(ind+1,0,cap,arr));
        return t[ind][buy][cap];
    }
}