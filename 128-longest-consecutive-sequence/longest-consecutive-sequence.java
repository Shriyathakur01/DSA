class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }

        for(int n:st){
            if(!st.contains(n-1)){
                int len=1;
                while(st.contains(n+len)){
                    len++;
                }
                res=Math.max(res,len);
            }
        }
        return res;
    }
}