class Solution {
    public int numberOfSubstrings(String s) {
        int[]lseen=new int[3];
        int l=0,r=0,count=0;
        while(r<s.length()){
            lseen[s.charAt(r)-'a']++;
            while(lseen[0]>0 && lseen[1]>0 && lseen[2]>0){
                count+=(s.length()-r);
                lseen[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return count;
    }
}