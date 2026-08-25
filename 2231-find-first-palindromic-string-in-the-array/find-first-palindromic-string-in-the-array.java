class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int len=s.length();
            int l=0,r=len-1;
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)) break;
                l++;
                r--;
            }
            if(l>=r) return s;
        }
        return "";
    }
}