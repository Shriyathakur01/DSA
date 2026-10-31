class Solution {
    static int[][]dp;
    public int longestCommonSubsequence(String text1, String text2) {
        int a=text1.length();
        int b=text2.length();
        dp=new int[a+1][b+1];
        return helper(text1,text2,a,b);
    }

    private int helper(String s1,String s2,int a,int b){
        for(int i=0;i<a+1;i++){
            for(int j=0;j<b+1;j++){
                if(i==0||j==0) dp[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[a][b];
    }
}