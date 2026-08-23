class Solution {
    public int maximum69Number (int num) {
        String nums=String.valueOf(num);
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(char ch:nums.toCharArray()){
            if(ch=='6'){
                sb.append('9');
                i++;
                break;
            }
            else{
                sb.append(ch);
                i++;
            }
        }

        for(int j=i;j<nums.length();j++){
            sb.append(nums.charAt(j));
        }

        int numb = Integer.parseInt(sb.toString());
        return numb;
    }
}