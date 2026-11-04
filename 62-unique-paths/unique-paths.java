class Solution {
    static int[][]t;
    public int uniquePaths(int m, int n) {
        t=new int[m][n];
        return helper(m-1,n-1);
    }

    private int helper(int a,int b){
        for(int i=0;i<a+1;i++){
            for(int j=0;j<b+1;j++){
                if(i==0 && j==0) t[i][j]=1;
                else{
                    int up=0;
                    int left=0;
                    if(i>0) up=t[i-1][j];
                    if(j>0) left=t[i][j-1];
                    t[i][j]=up+left;
                }
            }
        }
        return t[a][b];
    }
}