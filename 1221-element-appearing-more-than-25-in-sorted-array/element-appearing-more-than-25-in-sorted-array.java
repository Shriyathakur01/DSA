class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int per=n*25/100;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[j]==arr[i]) count++;
                else break;
            }
            if(count>per) return arr[i];
        }
        return -1;
    }
}