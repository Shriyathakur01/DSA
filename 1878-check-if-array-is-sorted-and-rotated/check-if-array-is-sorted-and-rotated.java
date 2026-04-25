class Solution {
    public boolean check(int[] arr) {
        int drop=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                drop++;
            }
        }
        // if(arr[arr.length-1]>arr[0]){
        //     drop++;
        // }
        if(drop>1)return false;
        else return true;
    }
}