class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st=new Stack<>();
        int n=nums2.length;
        int[]nge=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=nums2[i]) st.pop();
            if(st.isEmpty())nge[i]=-1;
            else nge[i]=st.peek();
            st.push(nums2[i]);
        }
        int l=nums1.length;
        int[]res=new int[l];
        for(int i=0;i<l;i++){
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]) res[i]=nge[j];
            }
        }
        return res;
    }
}