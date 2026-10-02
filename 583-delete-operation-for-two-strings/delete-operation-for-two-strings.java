class Solution {
    static int dp[][];
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        dp=new int[n+1][m+1];
        int len=lcs(word1,word2,n,m);
        return (n-len)+(m-len);

    }

    private int lcs(String s1,String s2,int n,int m){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0) dp[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[n][m];
    }
}