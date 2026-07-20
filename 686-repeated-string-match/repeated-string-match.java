class Solution {
    public int repeatedStringMatch(String a, String b) {
        String temp="";
        int count=0;
        while(temp.length()<b.length()){
            temp+=a;
            count++;
        }
        if(temp.indexOf(b)!=-1) return count;

        temp+=a;
        count++;
        if(temp.indexOf(b)!=-1) return count;

        return -1;
        
    }
}