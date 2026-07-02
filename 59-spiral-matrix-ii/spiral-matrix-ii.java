class Solution {
    public int[][] generateMatrix(int n) {
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int nums=1;
        int[][]matrix=new int[n][n];
        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
            matrix[top][j]=nums++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
            matrix[i][right]=nums++;
            }
            right--;
            for(int j=right;j>=left;j--){
            matrix[bottom][j]=nums++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
            matrix[i][left]=nums++;
            }
            left++;
        }
        return matrix;
        
    }
}