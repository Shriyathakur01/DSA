class Solution {
    public int[] findErrorNums(int[] nums) {
        int[]hash=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        int[]res=new int[2];
        int j=0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]==2) res[j++]=i;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==0) res[j]=i;
        }
        return res;
    }
}