class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0;
        if(k>=nums.length) return nums.length;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0) count++;
                if(count<=k){
                    int len=j-i+1;
                    maxlen=Math.max(maxlen,len);
                }
                else break;
            }
        }
        return maxlen;
        
    }
}