class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int len=0;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0) break;
            int end=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            return end-i;
        }
        return 0;
    }
}