class Solution {
    static int[]t;
    public int rob(int[] nums) {
        int n=nums.length;
        t=new int[n];
        for(int i=0;i<n;i++){
            t[i]=-1;
        }
        return helper(nums,n-1);

    }

    private int helper(int[]nums,int ind){
        if(ind==0) return nums[0];
        if(ind<0) return 0;
        if(t[ind]!=-1) return t[ind];
        int pick=nums[ind]+helper(nums,ind-2);
        int not_pick=0+helper(nums,ind-1);
        t[ind]=Math.max(pick,not_pick);
        return t[ind];
    }
}