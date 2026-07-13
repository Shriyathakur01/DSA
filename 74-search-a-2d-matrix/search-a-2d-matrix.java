class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int s=0, e=n*m-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int row=mid/m;
            int col=mid%m;

            int element=matrix[row][col];
            if(element==target) return true;
            else if(element>target) e=mid-1;
            else s=mid+1;
        }
        return false;
    }
}