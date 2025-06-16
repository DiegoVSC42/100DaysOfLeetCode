//Maximum Number of Vowels in a Substring of Given Length

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

// Max Consecutive Ones III

class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0;
        int zeros = 0;   
        int i = 0;       

        for (int j = 0; j < nums.length; j++) {
    
            if (nums[j] == 0) zeros++;
    
            while (zeros > k) {
                if (nums[i] == 0) zeros--;
                i++;
            }
    
            maxLength = Math.max(maxLength, j - i + 1);
        }
        
        return maxLength;
    }
}