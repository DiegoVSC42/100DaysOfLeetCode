class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1 ; i < prices.length ;i++){
            minPrice = minPrice < prices[i] ? minPrice : prices[i];
            maxProfit = (prices[i] - minPrice) > maxProfit ? (prices[i] - minPrice) : maxProfit;
        }
        return maxProfit;
    }
}