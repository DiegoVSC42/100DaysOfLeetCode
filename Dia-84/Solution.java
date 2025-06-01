// Container with most water

class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while(i != j){
            int currentHeight = Math.min(height[i],height[j]) ;
            int currentLength = j - i;
            int currentArea = currentHeight * currentLength;
            maxArea = Math.max(maxArea,currentArea);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}

//Longest Increasing Subsequence

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[nums.length - 1] = 1;
        int result = 1;
        for(int i = nums.length-2 ; i >= 0 ; i--){
            dp[i] = 1;
            for(int j = i + 1; j < nums.length ; j++){
                if(nums[i] < nums[j]){
                    dp[i] = Math.max(dp[i],1 + dp[j]);
                }
            }
            result = Math.max(result,dp[i]);
        }
        return result;
    }   
}