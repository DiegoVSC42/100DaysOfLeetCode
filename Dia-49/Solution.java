class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            map.put(c,!map.containsKey(c) ? 1 : map.get(c) + 1);
        }
        List<Character> l = new ArrayList(map.keySet());
        Collections.sort(l, (a,b) -> map.get(b) - map.get(a));
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < l.size();i++){
            for(int j = 0 ; j < map.get(l.get(i));j++){
                result.append(l.get(i));
            }
        }
        return result.toString();
    }
}