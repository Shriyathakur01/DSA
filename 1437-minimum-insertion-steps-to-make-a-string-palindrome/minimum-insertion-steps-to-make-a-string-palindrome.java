class Solution {
    static int[][]t;
    public int minInsertions(String s) {
        int n=s.length();
        t=new int[n+1][n+1];
        StringBuilder sb=new StringBuilder(s);
        String t=sb.reverse().toString();
        int len=lps(s,t,n,n);
        return n-len;

    }

    private int lps(String s1,String s2,int n,int m){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0) t[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[n][m];
    }
}