class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
            i++;
        }
        else if(nums2[j]<nums1[i]){
            j++;
        }
        else {
            if(list.size()==0||list.get(list.size()-1)!=nums1[i]){
            list.add(nums1[i]);
            }
            i++;
            j++;
        }
        }
        int n=list.size();
        int[]arr=new int[n];
        int k=0;
        for(int x:list){
            arr[k++]=x;
        }
        return arr;
    }
}