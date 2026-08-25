class Solution {
    public int trap(int[] height) {
        int leftmax=0,rightmax=0,total=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            if(height[l]<=height[r]){
                if(leftmax>height[l])
                total+=leftmax-height[l];
                else leftmax=height[l];
                l++;
            }
            else{
                if(rightmax>height[r])total+=rightmax-height[r];
                else rightmax=height[r];
                r--;
            }
        }
        return total;
    }
}