class Solution {
    public int splitArray(int[] nums, int k) {
        if(k>nums.length) return -1;
        int max=Arrays.stream(nums).max().getAsInt();
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(split(nums,mid)<=k){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }

    public int split(int[]arr,int barrier){
        int books=1;
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]<=barrier){
                sum+=arr[i];
            }
            else{
                books++;
                sum=arr[i];
            }
        }
        return books;
    }
}