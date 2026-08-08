class Solution {
    public int titleToNumber(String title) {
        int ans=0;
        int i=0;
        while(i<title.length()){
            int value=title.charAt(i)-'A'+1;
            ans=ans*26+value;
            i++;
        }
        return ans;
    }
}