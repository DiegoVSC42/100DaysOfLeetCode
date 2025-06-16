class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int vowelCount = 0;
        int maxCount = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                vowelCount++;
            }
        }
        maxCount = vowelCount;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) {
                vowelCount--;
            }
            if (vowels.contains(s.charAt(i))) {
                vowelCount++;
            }
            maxCount = Math.max(maxCount, vowelCount);
        }
        return maxCount;
    }
}