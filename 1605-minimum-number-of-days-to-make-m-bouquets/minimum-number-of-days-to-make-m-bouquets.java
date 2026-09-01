class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min=Arrays.stream(bloomDay).min().getAsInt();
        int max=Arrays.stream(bloomDay).max().getAsInt();
        int ans=-1;
        int low=min;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int bouq=helper(bloomDay,k,mid);
            if(bouq>=m){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
        
    }

    private int helper(int[] bloomDay,int k,int day){
        int count=0;
        int bouq=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
                if(count==k){
                    bouq++;
                    count=0;
                }
            }
            else count=0;
        }
        return bouq;
    }
}