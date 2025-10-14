class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        int r=matrix.length;
        int c=matrix[0].length;
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalelements=0;
        List<Integer> ans = new ArrayList<>();
        while(totalelements<r*c){
            for(int j=leftCol;j<=rightCol && totalelements<r*c;j++){
                ans.add(matrix[topRow][j]);
                totalelements++;
            }
            topRow++;

            for(int i=topRow;i<=bottomRow && totalelements<r*c;i++){
                ans.add(matrix[i][rightCol]);
                totalelements++;
            }
            rightCol--;

            for(int j=rightCol;j>=leftCol && totalelements<r*c;j--){
                ans.add(matrix[bottomRow][j]);
                totalelements++;
            }
            bottomRow--;

            for(int i=bottomRow;i>=topRow && totalelements<r*c;i--){
                ans.add(matrix[i][leftCol]);
                totalelements++;
            }
            leftCol++;
        }
        return ans;
    }
}