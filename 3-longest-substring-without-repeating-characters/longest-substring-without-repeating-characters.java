class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int len=0;
        int[]hash=new int[128];
        while(r<s.length()){
            hash[s.charAt(r)]++;
            while(hash[s.charAt(r)]!=1){
                hash[s.charAt(l)]--;
                l++;
            }
            len=Math.max(r-l+1,len);
            r++;
        }
        return len;
    }
}