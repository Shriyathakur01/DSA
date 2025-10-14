class Solution {
    static void transposed(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    static void reverse(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public void rotate(int[][] matrix) {
        transposed(matrix);
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
}