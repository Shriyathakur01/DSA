class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int tmp=n;
        while(tmp>0){
            int digit=tmp%10;
            rev=rev*10+digit;
            tmp/=10;
        }
        return Math.abs(rev-n);
    }
}