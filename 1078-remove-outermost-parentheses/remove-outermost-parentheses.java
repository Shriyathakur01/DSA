class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character>st=new Stack<>();
        String ans="";
        for(char ch:s.toCharArray()){
            if(ch=='(' ){
                if(st.isEmpty()) st.push(ch);
                else if(!st.isEmpty()){
                    st.push(ch);
                    ans+='(';
                }
            }
            else if(ch==')'){
                st.pop();
                if(!st.isEmpty()) ans+=')';
            }
        }
        return ans;
    }
}