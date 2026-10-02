class Solution {
    static int mt[][];
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        mt=new int[n+1][n+1];
        StringBuilder sb=new StringBuilder(s);
        String t=sb.reverse().toString();
        return lps(s,t,n,n);
    }

    private int lps(String s1,String s2,int n,int m){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0) mt[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    mt[i][j]=mt[i-1][j-1]+1;
                }
                else mt[i][j]=Math.max(mt[i-1][j],mt[i][j-1]);
            }
        }
        return mt[n][m];
    }
}

