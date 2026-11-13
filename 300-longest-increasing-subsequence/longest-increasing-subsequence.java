class Solution {
    static int[][]t;
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        t=new int[n][n+1];
        for(int[]rows:t){
            Arrays.fill(rows,-1);
        }
        return helper(0,-1,nums);
    }

    private int helper(int ind,int prevInd,int[]nums){
        if(ind==nums.length) return 0;
        if(t[ind][prevInd+1]!=-1) return t[ind][prevInd+1];
        int not_take=helper(ind+1,prevInd,nums);
        int take=0;
        if(prevInd==-1||nums[ind]>nums[prevInd]) take=1+helper(ind+1,ind,nums);
        t[ind][prevInd+1]=Math.max(take,not_take);
        return t[ind][prevInd+1];
    }
}