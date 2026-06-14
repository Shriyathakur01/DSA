class Solution {
    public void setZeroes(int[][] matrix) {
        //brute force
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    for(int row=0;row<r;row++){
                        if(matrix[row][j]!=0){
                        matrix[row][j]=-11;
                        }
                    }

                    for(int col=0;col<c;col++){
                        if(matrix[i][col]!=0){
                            matrix[i][col]=-11;
                        }
                    }
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==-11){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}