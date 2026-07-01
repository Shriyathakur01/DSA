class Solution {
    public String removeOuterParentheses(String s) {
        int counter=0;
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(counter>0) ans.append(ch);
                counter++;
            }
            else if(ch==')'){
                counter--;
                if(counter>0) ans.append(ch);
            }
        }
        return ans.toString();
        
    }
}