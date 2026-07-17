class Solution {
    public int numberOfSubarrays(int[] nums, int goal) {
        return func(nums,goal)-func(nums,goal-1);
    }
    public int func(int[]nums,int goal){
        if(goal<0)return 0;
        int l=0,r=0;
        int sum=0;
        int count=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            while(sum>goal){
                sum=sum-(nums[l]%2);
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}