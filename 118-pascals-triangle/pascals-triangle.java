class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||i==j){
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