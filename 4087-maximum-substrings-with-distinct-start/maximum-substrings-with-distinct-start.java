class Solution {
    public int maxDistinct(String s) {
        HashSet<Character>st=new HashSet<>();
        for(char x:s.toCharArray()){
            st.add(x);
        }
        return st.size();
    }
}