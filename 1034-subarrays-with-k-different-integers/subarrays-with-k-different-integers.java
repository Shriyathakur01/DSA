class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return func(nums,k)-func(nums,k-1);
    }
    public int func(int[]nums,int k){
        if(k==0) return 0;
        int l=0,r=0;
        int num=0;
        Map<Integer,Integer>map=new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
            }
            if(map.size()<=k) num+=r-l+1;
            r++;
        }
        return num;
    }
}