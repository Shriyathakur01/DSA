class Solution {
    static int[][]t;
    public int longestCommonSubsequence(String text1, String text2) {
        int i=text1.length();
        int j=text2.length();
        t=new int[i+1][j+1];
        return helper(text1,text2,i,j);
    }

    private int helper(String s1,String s2,int m,int n){
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0) t[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[m][n];
    }
}