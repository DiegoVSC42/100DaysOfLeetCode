class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        Map<Character,Integer> map1 = new HashMap <>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(Character c : word1.toCharArray()){
            map1.merge(c,1,Integer::sum);
        }

        for(Character c : word2.toCharArray()){
            map2.merge(c,1,Integer::sum);
        }

        Set<Character> map1Keys = new TreeSet<>(map1.keySet());
        Set<Character> map2Keys = new TreeSet<>(map2.keySet());

        if(!map1Keys.equals(map2Keys)) return false;

        List<Integer> map1Values = new ArrayList<>(map1.values());
        List<Integer> map2Values = new ArrayList<>(map2.values());

        Collections.sort(map1Values);
        Collections.sort(map2Values);

        return map1Values.equals(map2Values);
    }
}