class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int[]even=new int[n/2];
        int[]odd=new int[n/2];
        int k=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) even[k++]=nums[i];
            else odd[j++]=nums[i];
        }

        int[]ans=new int[n];
        int q=0;
        int s=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=even[q++];
            }
            else ans[i]=odd[s++];
        }
        return ans;
    }
}