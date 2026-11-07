class Solution {
    static int[][]t;
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        t=new int[n][n];
        for(int j=0;j<n;j++){
            t[n-1][j]=triangle.get(n-1).get(j);
        }

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                int down=t[i+1][j];
                int diag=t[i+1][j+1];
                t[i][j]=triangle.get(i).get(j)+Math.min(down,diag);
            }
        }
        return t[0][0];
    }

   
}