class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[]res=new int[n];
        for(int i=0;i<n;i++){
            int curr=nums1[i];
            int j=0;
            int next=-1;
            while(j<m&&nums2[j]!=curr) j++;
            for(int k=j+1;k<m;k++){
                if(nums2[k]>curr){
                    next=nums2[k];
                    break;
                }
            }
            res[i]=next;
        }
        return res;
    }
}