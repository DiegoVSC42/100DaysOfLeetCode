class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        int i = 2;
        while(i < cost.length){
            dp[i] = dp[i-1] < dp[i-2] ? cost[i] + dp[i-1] : cost[i] + dp[i-2];
            i++;
        }
        int minCost = dp[cost.length-1] < dp[cost.length-2] ? dp[cost.length-1] : dp[cost.length-2];
        return minCost;
    }
}