class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int num=asteroids[i];
            if(num>0){
                st.push(num);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(num)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(num)){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                    st.push(num);
                }
                
            }
        }
        int[] arr=new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()){
            arr[i]=st.pop();
            i--;
        }
        return arr;
    }
}