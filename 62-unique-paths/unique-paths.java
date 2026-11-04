class Solution {
    static int[][]t;
    public int uniquePaths(int m, int n) {
        t=new int[m][n];
        for(int[]rows:t){
            Arrays.fill(rows,-1);
        }
        
        return helper(m-1,n-1);
    }

    private int helper(int i,int j){
        if(i==0 && j==0) return 1;
        else if(i<0 || j<0) return 0;
        if(t[i][j]!=-1) return t[i][j];
        int up=helper(i-1,j);
        int right=helper(i,j-1);
        t[i][j]=up+right;
        return t[i][j];
    }
}