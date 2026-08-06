class Solution {
    public int eraseOverlapIntervals(int[][] mat) {
        Arrays.sort(mat,(a,b)->a[1]-b[1]);
        int count=0;
        int endingTime=mat[0][1];
        for(int j=1;j<mat.length;j++){
            if(endingTime>mat[j][0]) count++;

            else endingTime=mat[j][1];
        }
        return count;
    }
}