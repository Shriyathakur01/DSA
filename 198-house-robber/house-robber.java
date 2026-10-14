class Solution {
    static int[]t;
    public int rob(int[] nums) {
        int n=nums.length;
        t=new int[n];
        return helper(nums,n-1);

    }

    private int helper(int[]nums,int ind){
        t[0]=nums[0];
        for(int i=1;i<=ind;i++){
            int take=nums[i];
            if(i>1) take+=t[i-2];
            int not_take=0+t[i-1];
            t[i]=Math.max(take,not_take);
        }
        
        return t[ind];
    }
}