class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int result = 0, start = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(charMap.containsKey(c) && charMap.get(c) >= start){
                start = charMap.get(c) + 1;
            }
            charMap.put(c,i);
            result = result < i - start + 1 ? i - start + 1 : result;
        }
        return result;
    }
}