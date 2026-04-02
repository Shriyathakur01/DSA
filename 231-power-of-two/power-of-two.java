class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0) return false;
        String bin=Integer.toBinaryString(n);
        int len=bin.length();
        char[] arr=bin.toCharArray();
        int count=0;
        for(int i=0;i<len;i++){
            if(arr[i]=='1') count++;
        }
        if(count==1) return true;
        else return false;
    }
}