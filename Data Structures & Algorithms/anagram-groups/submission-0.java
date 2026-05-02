class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l1 = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            List<String> l = new ArrayList<>();
            l.add(strs[i]);
            if(visited[i]) continue;
            for(int j=i+1;j<strs.length;j++){
                if(strs[i].length() != strs[j].length()){
                    continue;
                }
                else{
                    boolean check = anagram(strs[i], strs[j]);
                    if (check){
                        l.add(strs[j]);
                        visited[j] = true;
                    }
                }
            }
            l1.add(l);
        }
        return l1;
    }
    public boolean anagram(String s, String s1){
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            for(char c : s.toCharArray()){
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }
            for(char c : s1.toCharArray()){
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }
            if(map1.equals(map2)){
                return true;
            }
            else{
                return false;
            }
        }
}

