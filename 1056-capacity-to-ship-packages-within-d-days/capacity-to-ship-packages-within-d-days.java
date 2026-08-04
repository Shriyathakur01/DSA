class Solution {
    public int helper(int[]weights,int capacity){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int max=Arrays.stream(weights).max().getAsInt();
        int sum=0;
        for(int num:weights){
            sum+=num;
        }
        int low=max,high=sum;
        int ans=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(weights,mid)<=days){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}