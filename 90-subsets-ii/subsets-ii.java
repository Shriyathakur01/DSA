class Solution {
    public void findsubsets(int ind,int[]arr,List<Integer>ds,List<List<Integer>>ans){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            findsubsets(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ansList=new ArrayList<>();
        findsubsets(0,nums,new ArrayList<>(),ansList);
        return ansList;
    }
}