class Solution {
    public boolean isPossible(int[] bloomDay,int day,int m,int k){
        int count=0;
        int bouq=0;
        for(int bloom:bloomDay){
            if(bloom<=day){
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

    public int minDays(int[] bloomDay, int m, int k) {
        long total=m*k;
        if(total>bloomDay.length) return -1;
        int min=Arrays.stream(bloomDay).min().getAsInt();
        int max=Arrays.stream(bloomDay).max().getAsInt();
        int ans=-1;
        int low=min;
        int high=max;
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
}