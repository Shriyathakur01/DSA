class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int total=m*k;
        if(total>bloomDay.length) return -1;
        int min=Arrays.stream(bloomDay).min().getAsInt();
        int max=Arrays.stream(bloomDay).max().getAsInt();
        int low=min;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    private boolean isPossible(int[]arr,int day,int m,int k){
        int count=0;
        int bouq=0;
        for(int x:arr){
            if(x<=day){
                count++;
                if(count==k){
                    bouq++;
                    count=0;
                }
            }
            else count=0;
        }
        return bouq>=m;
    }
}