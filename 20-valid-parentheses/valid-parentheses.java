class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='['|| ch=='{' || ch=='('){
                st.push(ch);
            }
            if(ch==')' || ch==']' || ch=='}'){
                if(st.isEmpty()) return false;
                char top=st.peek();
                if((ch==']' && top=='[') ||
                    (ch==')' && top=='(')||
                    (ch=='}' && top=='{')
                ) st.pop();
                else return false;
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }
}