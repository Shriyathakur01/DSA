class Solution {
    public int maximumGap(String skill, String station) {
        int n=skill.length();
        int m=station.length();
        int[]left=new int[n];
        int[]right=new int[n];
        int j=0;
        for(int i=0;i<m && j<n;i++){
            if(skill.charAt(j)==station.charAt(i)){
                left[j]=i;
                j++;
            }
        }
        j=n-1;
        for(int i=m-1;i>=0 && j>=0;i--){
            if(skill.charAt(j)==station.charAt(i)){
                right[j]=i;
                j--;
            }
        }
        int max=0;
        for(int i=0;i<n-1;i++){
            int diff=Math.abs(left[i]-right[i+1]);
            max=Math.max(max,diff);
        }

        return max;
    }
}