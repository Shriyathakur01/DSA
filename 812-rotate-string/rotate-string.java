class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder(s);
        sb.append(s);
        if(s.length()!=goal.length()) return false;
        if(sb.toString().contains(goal)) return true;
        else return false;
    }
}