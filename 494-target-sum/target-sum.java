class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int x:nums){
            total+=x;
        }
        if(Math.abs(target)>total||(total+target)%2!=0) return 0;
        int newTarget=(total+target)/2;
        int[][]t=new int[nums.length+1][newTarget+1];
        t[0][0]=1;
        for(int i=1;i<nums.length+1;i++){
            for(int j=0;j<newTarget+1;j++){
                t[i][j]=t[i-1][j];
                if(nums[i-1]<=j){
                    t[i][j]+=t[i-1][j-nums[i-1]];
                }
            }
        }
        return t[nums.length][newTarget];
    }
}