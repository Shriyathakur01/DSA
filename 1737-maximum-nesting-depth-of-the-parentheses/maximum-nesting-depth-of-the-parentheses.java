class Solution {
    public int maxDepth(String s) {
        Stack<Character>st=new Stack<>();
        int size=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                size=Math.max(size,st.size());
                if(st.size()>0){
                    st.pop();
                }
            }
        }
        return size;
        
    }
}