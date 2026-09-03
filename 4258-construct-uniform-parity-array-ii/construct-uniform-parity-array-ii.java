class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Arrays.stream(nums1).min().getAsInt();
        for(int i=0;i<nums1.length;i++){
            if(min%2==0){
                if(nums1[i]%2==1) return false;
            }
        }
        return true;
    }
}