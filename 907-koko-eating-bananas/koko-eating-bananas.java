class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Arrays.stream(piles).max().getAsInt();
        int low=1;
        int high=max;
        int ans=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int hours=helper(piles,mid,h);
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    private int helper(int[]piles,int hourly,int h){
        int hrs=0;
        for(int pile:piles){
            hrs+=Math.ceil((double)pile/hourly);
        }
        return hrs;
    }
}