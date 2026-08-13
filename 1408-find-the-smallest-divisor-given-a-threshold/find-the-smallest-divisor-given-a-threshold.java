class Solution {

    private int getAns(int[]arr,int num){
        int total=0;
        for(int x:arr){
            total+=Math.ceil((double)x/num);
        }
        return total;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int max=Arrays.stream(nums).max().getAsInt();
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int total=getAns(nums,mid);
            if(total<=threshold){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}