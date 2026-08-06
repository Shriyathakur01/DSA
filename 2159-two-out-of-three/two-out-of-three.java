class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer>st1=new HashSet<>();
        Set<Integer>st2=new HashSet<>();
        Set<Integer>st3=new HashSet<>();
        for(int x:nums1) st1.add(x);
        for(int y:nums2) st2.add(y);
        for(int z:nums3) st3.add(z);

        List<Integer>res=new ArrayList<>();
        for(int i=0;i<=100;i++){
            int count=0;
            if(st1.contains(i)) count++;
            if(st2.contains(i)) count++;
            if(st3.contains(i)) count++;

            if(count>=2) res.add(i);
        }
        return res;
    }
}