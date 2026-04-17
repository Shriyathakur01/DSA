class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;
        Stack<Integer>st=new Stack<>();
        int n=heights.length;
        int currHeight;
        for(int i=0;i<=n;i++){
            currHeight=0;
            if(i==n){
                currHeight=0;
            }
            else currHeight=heights[i];

            while(!st.isEmpty()&&currHeight<heights[st.peek()]){
                int height=heights[st.pop()];
                int right=i;
                int left;
                if(st.isEmpty()) left=-1;
                else
                    left=st.peek();
                    int width=right-left-1;
                    int area=height*width;

                    if(area>maxarea){
                        maxarea=area;
                    }
            }
           st.push(i);   
        }
        return maxarea;
    }
}