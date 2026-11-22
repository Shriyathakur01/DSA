class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int[]freq=new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int l=0,r=0;
        int count=t.length();
        int minLen=Integer.MAX_VALUE;
        int start=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(freq[ch]>0){
                count--;
            }
            freq[ch]--;
            r++;
            while(count==0){
                if(r-l<minLen){
                    minLen=r-l;
                    start=l;
                }
                char remove=s.charAt(l);
                freq[remove]++;
                if(freq[remove]>0){
                    count++;
                }
                l++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}