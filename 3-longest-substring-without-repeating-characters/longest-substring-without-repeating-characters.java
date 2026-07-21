class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int r=0,l=0;
        int[] freq=new int[256];
        Arrays.fill(freq,-1);
        while(r<s.length()){
            if(freq[s.charAt(r)]!=-1){
                if(freq[s.charAt(r)]>=l){
                    l=freq[s.charAt(r)]+1;
                }
            }
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
            freq[s.charAt(r)]=r;
            r++;
        }
        return maxlen;
    }
}