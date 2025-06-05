// Merge alternately

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0,j = 0;
        StringBuilder result = new StringBuilder();
        while(i < word1.length() || j < word2.length()){
            if(i < word1.length()){
                result.append(word1.charAt(i));
                i++;
            }
            if(j < word2.length()){
                result.append(word2.charAt(j));
                j++;
            }
        }
        return result.toString();
    }
}

// Move zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(fast < nums.length){
            if(nums[fast] != 0){
                if(slow != fast){
                    nums[slow] = nums[fast];
                    nums[fast] = 0;
                }
                slow++;
            }
            fast++;
        }
    }
}

// Find maximum average subarray of size k
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for(int i = 0 ; i < k ;i++){
            windowSum += nums[i];
        }
        double maxAverage = (double) windowSum / k;
        for(int i = k ; i < nums.length ;i++){
            windowSum += nums[i] - nums[i - k];
            double currentAverage = (double) windowSum / k;
            maxAverage = Math.max(maxAverage,currentAverage);
        }
        return maxAverage;
    }
}