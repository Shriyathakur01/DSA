class Solution {
    public int[] countBits(int n) {
        int[]res=new int[n+1];
        for(int i=0;i<n+1;i++){
            int count=0;
            int x=i;
            while(x>0){
                int rem=x%2;
                if(rem==1) count+=1;
                x/=2;
            }
            res[i]=count;
        }
        return res;
    }
}