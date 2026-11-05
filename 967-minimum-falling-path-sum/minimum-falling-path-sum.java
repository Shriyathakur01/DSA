class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][]t=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0) t[i][j]=matrix[0][j];
                else{
                    int up=t[i-1][j];
                    int left=Integer.MAX_VALUE;
                    int right=Integer.MAX_VALUE;
                    if(j>0) left=t[i-1][j-1];
                    if(j<m-1) right=t[i-1][j+1];
                    // if(left!=Integer.MAX_VALUE) left=matrix[i][j]+left;
                    // if(right!=Integer.MAX_VALUE) right=matrix[i][j]+right;
                    t[i][j]=matrix[i][j]+Math.min(up,Math.min(left,right));

                }
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            ans=Math.min(ans,t[n-1][j]);
        }
        return ans;
    }
}