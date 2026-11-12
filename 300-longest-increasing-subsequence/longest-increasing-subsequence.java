class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int low=0;
            int high=list.size();
            while(low<high){
                int mid=low+(high-low)/2;
                if(list.get(mid)<nums[i]) low=mid+1;
                else high=mid; //no mid cuz searching lower bound
            }
            if(low==list.size()) list.add(nums[i]);
            else list.set(low,nums[i]);  //overwrite
        }
        return list.size();
    }
}