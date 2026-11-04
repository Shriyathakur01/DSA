class Solution {
    static int[][]t;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        t=new int[m+1][n+1];
        for(int[]rows:t){
            Arrays.fill(rows,-1);
        }
        return helper(m-1,n-1,obstacleGrid);
    }

    private int helper(int a,int b,int[][]arr){
        if(a>=0 && b>=0 && arr[a][b]==1) return 0;
        if(a==0 && b==0) return 1;
        if(a<0 || b<0) return 0;
        if(t[a][b]!=-1) return t[a][b];
        int up=helper(a-1,b,arr);
        int left=helper(a,b-1,arr);
        t[a][b]=up+left;
        return t[a][b];
    }
}
