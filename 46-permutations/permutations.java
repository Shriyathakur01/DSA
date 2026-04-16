class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        generate(nums,0,result);
        return result;
    }

    private static void generate(int[]arr,int index,List<List<Integer>>result){
        if(index==arr.length){
            List<Integer>temp=new ArrayList<>();
            for(int x:arr){
                temp.add(x);
            }
            result.add(temp);
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr,index,i);
            generate(arr,index+1,result);
            swap(arr,index,i);
        }
    }

    private static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}