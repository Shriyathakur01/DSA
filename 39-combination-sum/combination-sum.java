class Solution {
    public void findcomb(int index,int[]arr,int target,List<Integer>ds,List<List<Integer>>ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(index==arr.length) return;
        if(arr[index]<=target){
            ds.add(arr[index]);
            findcomb(index,arr,target-arr[index],ds,ans);
            ds.remove(ds.size()-1);
        }
        findcomb(index+1,arr,target,ds,ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        findcomb(0,candidates,target,new ArrayList<>(),res);
        return res;
    }
}