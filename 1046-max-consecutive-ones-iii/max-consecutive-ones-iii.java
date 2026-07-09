class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,maxlen=0,zeros=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]==0) zeros++;
            while(zeros>k){ //keep shrinking till valid window size
                if(nums[l]==0) zeros--;
                l++;
            }
            if(zeros<=k){
                int len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }
            r++;
        }
        return maxlen;
    }
}