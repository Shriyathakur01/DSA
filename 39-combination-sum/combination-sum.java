class Solution {
    public void findcomb(int ind,int[]arr,int target,List<List<Integer>>ans,List<Integer>temp){
        if(ind==arr.length){
            return;
        }    
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        if(arr[ind]<=target){
            temp.add(arr[ind]);
            findcomb( ind,arr,target-arr[ind],ans,temp);
            temp.remove(temp.size()-1);
        }
        findcomb(ind+1,arr,target,ans,temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        findcomb(0,candidates,target,ans,temp);
        return ans;
    }
}