class Solution {
    public int maximalRectangle(char[][] matrix) {
        int maxArea=0;
        int n=matrix.length;
        int m=matrix[0].length;
        if(n==0) return 0;
        int[]height=new int[m];
        for(char[]row:matrix){
            for(int i=0;i<m;i++){
                if(row[i]=='1') height[i]++;
                else height[i]=0;
            }
            maxArea=Math.max(maxArea,helper(height));
        }
        return maxArea;
    }

    private int helper(int[]arr){
        Stack<Integer>st=new Stack<>();
        int maxArea=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int el=st.peek();
                st.pop();
                int pse=st.isEmpty()?-1:st.peek();
                int nse=i;
                maxArea=Math.max(maxArea,arr[el]*(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int el=st.peek();
            st.pop();
            int nse=n;
            int pse=st.isEmpty()?-1:st.peek();
            maxArea=Math.max(maxArea,arr[el]*(nse-pse-1));
        }
        return maxArea;
    }
}