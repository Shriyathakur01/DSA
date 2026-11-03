class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[]t=new int[n+1];
        t[0]=nums[0];
        for(int i=1;i<=n-1;i++){
            int take=nums[i];
            if(i>1) take+=t[i-2];
            int not_take=0+t[i-1];
            t[i]=Math.max(take,not_take);
        }
        return t[n-1];
    }
}