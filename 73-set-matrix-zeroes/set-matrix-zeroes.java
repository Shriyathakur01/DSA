class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    for(int cols=0;cols<n;cols++){
                        if(matrix[i][cols]!=0){
                            matrix[i][cols]=-11;
                        }
                    }

                    for(int rows=0;rows<m;rows++){
                        if(matrix[rows][j]!=0){
                            matrix[rows][j]=-11;
                        }
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-11){
                    matrix[i][j]=0;
                }
            }
        }
    }
}