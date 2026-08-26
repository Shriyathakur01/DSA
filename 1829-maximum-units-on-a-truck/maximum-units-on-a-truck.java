class Solution {
    public int maximumUnits(int[][] box, int truckSize) {
        Arrays.sort(box,(a,b)->b[1]-a[1]);
        int count=0;
        for(int i=0;i<box.length;i++){
            int take=Math.min(truckSize,box[i][0]);
            count+=take*box[i][1];
            truckSize-=take;
            if(truckSize==0) break;
        }
        return count;
    }
}