class Solution {
    public int majorityElement(int[] nums) {
        int balance=0;
        int candidate=0;
        for(int value:nums){
            if(balance==0) candidate=value;
            if(value==candidate) balance++;
            else balance--;
        }
        return candidate;
        
    }
}