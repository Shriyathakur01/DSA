class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character>set=new HashSet<>();
        int count=0;
        for(int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        for(char c:stones.toCharArray()){
            if(set.contains(c)) count++;
        }
        return count;
    }
}