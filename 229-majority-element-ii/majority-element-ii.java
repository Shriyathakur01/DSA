class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int balance1=0;
        int balance2=0;
        int candidate1=0;
        int candidate2=0;
        for(int i=0;i<nums.length;i++){
            if(balance1==0 &&nums[i]!=candidate2){
                balance1=1;
                candidate1=nums[i];
            }
            else if(balance2==0 && nums[i]!=candidate1){
                balance2=1;
                candidate2=nums[i];
            }
            else if(nums[i]==candidate1) balance1++;
            else if(nums[i]==candidate2) balance2++;
            else{
                balance1--;
                balance2--;
            }
        }
        int freq1=0;
        int freq2=0;
        for(int n:nums){
            if(n==candidate1) freq1++;
            else if(n==candidate2)freq2++;
        }
        int threshold=nums.length/3;
        ArrayList<Integer>list=new ArrayList<>();
        if(freq1>threshold) list.add(candidate1);
        if(freq2>threshold)list.add(candidate2);
        return list;
    }
}