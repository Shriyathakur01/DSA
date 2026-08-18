class Solution {
    public int[][] insert(int[][] intervals, int[] newInt) {
        int r=intervals.length;
        List<int[]>res=new ArrayList<>();
        int i=0;
        while(i<r && intervals[i][1]<newInt[0]){
            res.add(intervals[i]);
            i++;
        }
        while(i<r && intervals[i][0]<=newInt[1]){
            newInt[0]=Math.min(intervals[i][0],newInt[0]);
            newInt[1]=Math.max(intervals[i][1],newInt[1]); 
            i++;
        } 
        res.add(newInt);
        while(i<r){
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}