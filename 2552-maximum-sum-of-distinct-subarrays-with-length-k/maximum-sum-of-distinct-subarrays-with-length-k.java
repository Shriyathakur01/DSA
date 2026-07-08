class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        int left=0;
        long windowsum=0;
        long maxsum=0;
        for(int right=0;right<nums.length;right++){
            windowsum+=nums[right];
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            if(right-left+1>k){
                windowsum-=nums[left]; 

                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0) map.remove(nums[left]);

                left++;
            }

            if(right-left+1==k && map.size()==k){
                maxsum=Math.max(windowsum,maxsum);
            }
        }
        return maxsum;        
    }
}