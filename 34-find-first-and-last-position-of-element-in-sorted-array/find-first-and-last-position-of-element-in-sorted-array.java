class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=binary_first(nums,target);
        if(first==-1) return new int[]{-1,-1};
        int last=binary_last(nums,target);
        return new int[]{first,last};
    }
    public int binary_first(int[] nums,int target){
        int low=0,high=nums.length-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else high=mid-1;
        }
        return first;
    }
    public int binary_last(int[]nums,int target){
        int low=0;
        int high=nums.length-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else low=mid+1;
        }
        return last;
    }
}