class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]ans=new int[2];
        int k=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            if(map.containsKey(need)){
                ans[k++]=i;
                ans[k++]=map.get(need);
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}