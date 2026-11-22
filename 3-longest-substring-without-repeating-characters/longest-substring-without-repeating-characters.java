class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0;
        int l=0;
        int len=0;
        int[]hash=new int[127];
        while(r<s.length()){
            hash[s.charAt(r)]++;
            while(hash[s.charAt(r)]>1){
                hash[s.charAt(l)]--;
                l++;
            }
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}