class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[]suffix=new int[n];
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.min(nums[i],suffix[i+1]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,nums[i]);
            int score=max-suffix[i];
            if(score<=k) return i;
        }
        int maxend=Arrays.stream(nums).max().getAsInt();
        int endscore=maxend-suffix[n-1];
        if(endscore<=k) return nums.length-1;
        return -1;
    }
}