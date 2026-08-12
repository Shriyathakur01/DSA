class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Arrays.stream(piles).max().getAsInt();
        int low=1;
        int high=max;
        int ans=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hrs=getHours(piles,mid);
            if(hrs<=h){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;

    }

    private long getHours(int[]arr,int hour){
        long hours=0;
        for(int x:arr){
            hours+=Math.ceil((double)x/hour);
        }
        return hours;
    }
}