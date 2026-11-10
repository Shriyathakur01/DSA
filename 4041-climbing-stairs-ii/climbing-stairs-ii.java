class Solution {
    public int climbStairs(int n, int[] costs) {
        int[]t=new int[n+1];
        t[0]=0;
        for(int i=1;i<=n;i++){
            t[i]=t[i-1]+costs[i-1]+1;
            if(i>=2){
                t[i]=Math.min(t[i],t[i-2]+costs[i-1]+4);
            }
            if(i>=3){
                t[i]=Math.min(t[i],t[i-3]+costs[i-1]+9);
            }
        }
        return t[n];
    }
}