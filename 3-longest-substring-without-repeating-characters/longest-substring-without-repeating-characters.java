class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[]hash=new int[128];
        int l=0,r=0;
        int maxlen=0;
        while(r<s.length()){
            hash[s.charAt(r)]++;
            while(hash[s.charAt(r)]!=1){
                hash[s.charAt(l)]--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}