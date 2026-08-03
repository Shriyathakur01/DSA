class Solution {
    public int sumbydiv(int[]nums,int divisor){
        int sum=0;
        for(int n:nums){
            sum+=Math.ceil((double)n/divisor);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int max=nums[0];
        for(int num:nums){
            max=Math.max(max,num);
        }
        int low=1;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sumbydiv(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}