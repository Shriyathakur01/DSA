class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxVal = Arrays.stream(piles).max().getAsInt();
        int low=1;
        int high=maxVal;
        int ans=maxVal;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalhrs=calculatetotal(piles,mid);
            if(totalhrs<=h){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    public long calculatetotal(int[]a,int hourly){
        long totalhours=0;
        for(int pile:a){
            totalhours += (int)Math.ceil((double)pile / hourly);
        }
        return totalhours;
    }
}