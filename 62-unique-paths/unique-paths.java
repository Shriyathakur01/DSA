class Solution {
    public int uniquePaths(int m, int n) {
        int[][]t=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 && j==0) t[i][j]=1;
                else{
                    int up=0;
                    int left=0;
                    if(i>0)up=t[i-1][j];
                    if(j>0)left=t[i][j-1];
                    t[i][j]=up+left;
                }
            }
        }
        return t[m-1][n-1];
    }
}