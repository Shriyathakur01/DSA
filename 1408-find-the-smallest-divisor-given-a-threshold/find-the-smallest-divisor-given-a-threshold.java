class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=-1;
        int low=1;
        int max=Arrays.stream(nums).max().getAsInt();
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int total=helper(nums,mid);
            if(total<=threshold){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }   
        return ans;
    }
    private int helper(int[]nums,int div){
        int total=0;
        for(int num:nums){
            total+=Math.ceil((double)num/div);
        }
        return total;
    }
}