class Solution {
    public int characterReplacement(String s, int k) {
        int[]hash=new int[127];
        int l=0,r=0;
        int maxlen=0;
        int maxfreq=0;
        while(r<s.length()){
            hash[s.charAt(r)]++;
            maxfreq=Math.max(maxfreq,hash[s.charAt(r)]);
            if((r-l+1)-maxfreq>k){
                hash[s.charAt(l)]--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
        
    }
}