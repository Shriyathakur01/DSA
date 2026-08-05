class Solution {
    public int jump(int[] nums) {
        int s=0,e=0,maxIndex=0,n=nums.length,jumps=0;
        while(s<n-1){
            maxIndex=Math.max(maxIndex,s+nums[s]);
            if(s==e){
                jumps++;
                e=maxIndex;
            }
            s++;
        }
        return jumps;
    }
}