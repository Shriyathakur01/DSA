class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        return st.size()<nums.length;
    }
}