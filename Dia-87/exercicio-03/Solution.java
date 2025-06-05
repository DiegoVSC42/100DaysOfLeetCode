
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