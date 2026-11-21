class Solution {
    public int numberOfSubstrings(String s) {
        int[]hash=new int[3];
        int l=0,r=0;
        int len=0;
        while(r<s.length()){
            hash[s.charAt(r)-'a']++;
            while(hash[0]>0 && hash[1]>0 && hash[2]>0){
                len+=s.length()-r;
                hash[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return len;
    }
}