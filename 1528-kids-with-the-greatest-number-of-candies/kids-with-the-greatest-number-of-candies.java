class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        List<Boolean>list=new ArrayList<>();
        int max=0;
        for(int x:candies){
            max=Math.max(max,x);
        }
        for(int i=0;i<candies.length;i++){
            int total=candies[i]+extra;
            if(total>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}