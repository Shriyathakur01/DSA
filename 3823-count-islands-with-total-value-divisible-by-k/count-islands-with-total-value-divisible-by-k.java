import java.util.*;

class Solution {
    public int countIslands(int[][] grid,int k) {
        int m=grid.length,n=grid[0].length;
        int count=0;
        int[] dx={1,-1,0,0};
        int[] dy={0,0,1,-1};

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j]>0) {
                    Stack<Integer> st=new Stack<>();
                    st.push(i*n+j);

                    long sum=0;
                    sum+=grid[i][j];
                    grid[i][j]=0;

                    while(!st.isEmpty()) {
                        int cell=st.pop();
                        int x=cell/n;
                        int y=cell%n;

                        for(int d=0;d<4;d++) {
                            int nx=x+dx[d];
                            int ny=y+dy[d];

                            if(nx>=0&&nx<m&&ny>=0&&ny<n&&grid[nx][ny]>0) {
                                sum+=grid[nx][ny];
                                grid[nx][ny]=0;
                                st.push(nx*n+ny);
                            }
                        }
                    }

                    if(sum%k==0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}