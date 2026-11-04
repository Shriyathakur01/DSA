class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[][]t=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1) t[i][j]=0;
                else if(i==0 && j==0)t[i][j]=1;
                else{
                    int left=0;
                    int up=0;
                    if(i>0)up=t[i-1][j];
                    if(j>0)left=t[i][j-1];
                    t[i][j]=left+up; 
                }
            }
        }
        return t[m-1][n-1];
    }
}