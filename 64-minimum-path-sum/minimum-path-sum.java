class Solution {
    static int[][]t;
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        t=new int[m][n];
        for(int[]rows:t){
            Arrays.fill(rows,-1);
        }
        return helper(grid,m-1,n-1);
    }

    private int helper(int[][]grid,int i,int j){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(t[i][j]!=-1) return t[i][j];
        int up=helper(grid,i-1,j);
        int left=helper(grid,i,j-1);

        if(up!=Integer.MAX_VALUE) up+=grid[i][j];
        if(left!=Integer.MAX_VALUE) left+=grid[i][j];
        t[i][j]=Math.min(up,left);
        return t[i][j];
    }
    
}