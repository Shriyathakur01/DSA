class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for(String st:strs){
            char[] ch=st.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(st);
        }
        return new ArrayList<>(map.values());
        
    }
}