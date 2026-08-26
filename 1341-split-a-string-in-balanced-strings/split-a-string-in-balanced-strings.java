class Solution {
    public int balancedStringSplit(String s) {
        int balanced=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L') balanced++;
            else balanced--;
            if(balanced==0) count++;
        }   
        return count;
    }
}