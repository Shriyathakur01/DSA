class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb=new StringBuilder();
        while(col>0){
            col--;
            int rem=col%26;
            sb.append((char)('A'+rem));
            col/=26;
        }
        return sb.reverse().toString();
    }
}