class Solution {
    public int jump(int[] nums) {
        int maxIndex=0;
        int i=0;
        int currEnd=0;
        int jumps=0;
        while(i<nums.length-1){
            maxIndex=Math.max(maxIndex,nums[i]+i);
            if(i==currEnd){
                jumps++;
                currEnd=maxIndex;
            }
            i++;
        }
        return jumps;
    }
}