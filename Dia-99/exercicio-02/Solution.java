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