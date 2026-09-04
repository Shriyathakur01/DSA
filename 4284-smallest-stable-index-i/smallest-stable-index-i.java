class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int min=Arrays.stream(nums,i,nums.length).min().getAsInt();
            max=Math.max(max,nums[i]);
            int score=max-min;
            if(score<=k) return i;
        }
        int maxend=Arrays.stream(nums).max().getAsInt();
        int minend=nums[nums.length-1];
        int endscore=maxend-minend;
        if(endscore<=k) return nums.length-1;
        return -1;
    }
}