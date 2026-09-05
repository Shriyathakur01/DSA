class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Arrays.stream(weights).max().getAsInt();
        int sum=0;
        int ans=1;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            int dayss=helper(weights,mid);
            if(dayss<=days){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    private int helper(int[]weights,int capacity){
        int days=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]<=capacity) sum+=weights[i];
            else{
                sum=0;
                sum+=weights[i];
                days++;
            }
        }
        return days;
    }
}