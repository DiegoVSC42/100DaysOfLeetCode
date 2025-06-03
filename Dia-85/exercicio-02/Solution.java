class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int left = 0;
        int right = 0;
        int maxCount = 0;
        while (right < s.length()) {
            map.merge(s.charAt(right), 1, Integer::sum);
            maxCount = Math.max(maxCount, map.get(s.charAt(right)));

            int windowSize = right - left + 1;

            if (windowSize - maxCount > k) {
                map.merge(s.charAt(left), -1, Integer::sum);
                left++;
            } else {
                result = Math.max(result, windowSize);
            }

            right++;
        }
        return result;
    }
}
