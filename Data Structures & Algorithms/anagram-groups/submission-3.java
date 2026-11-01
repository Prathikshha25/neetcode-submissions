class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> n=new HashMap<>();
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            n.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(n.values());
    }
}
