class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        StringBuilder sb=new StringBuilder();
        for(int x:nums){
            sb.append(x);
        }
        sb.toString();
        int digsum=0;
        for(int i=0;i<sb.length();i++){
            digsum+=sb.charAt(i)-'0';
        }
        int diff=Math.abs(sum-digsum);
        return diff;
    }
}