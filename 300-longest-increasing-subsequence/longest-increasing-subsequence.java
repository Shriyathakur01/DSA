class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int low=0;
            int high=list.size();
            while(low<high){
                int mid=low+(high-low)/2;
                if(list.get(mid)<nums[i]) low=mid+1;
                else high=mid;
            }
            if(low==list.size()) list.add(nums[i]);
            else list.set(low,nums[i]);
        }
        return list.size();
    }
}