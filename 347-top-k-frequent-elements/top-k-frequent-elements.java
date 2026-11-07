class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]ans=new int[k];
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        for(int i=0;i<k;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}