class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int m) {
        int n=flowerbed.length;
        for(int i=0;i<n && m>0;i++){
            if(flowerbed[i]==0 &&
                (i==0 || flowerbed[i-1]==0) &&
                (i==n-1 || flowerbed[i+1]==0)
            ){
                flowerbed[i]=1;
                m--;
            }
        }
        if(m==0)return true;
        else return false;
    }
}