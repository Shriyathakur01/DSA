class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    list.add(1);
                }
                else{
                    List<Integer>row=ans.get(i-1);
                    list.add(row.get(j-1)+row.get(j));

                }
            }
            ans.add(list);
        }

        return ans;
    }
}