class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String str:strs){
            int[] freq=new int[26];
            for(char ch:str.toCharArray()){
                freq[ch-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i:freq){
                sb.append(i).append("#");
            }
            String key=sb.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}