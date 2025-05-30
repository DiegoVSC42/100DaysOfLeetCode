
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int size = 0;
        for(int num : stones){
            size+= num;
        }
        boolean[] dp = new boolean[size/2+1];
        dp[0] = true;
        for(int i = 0 ; i < stones.length; i++){
            int current = stones[i];
            for(int j = size/2 ; j >= 0; j--){
                if(dp[j] && j + current <= size/2){
                    dp[j + current] = true;
                }
            }
            if(dp[size/2]) break;  
        }
        int res = 0;
        for(int i = size/2; i >= 0 ;i--){
            if(dp[i]){
                res = i;
                break;
            }
        }
        return size - (2 * res);
    }
}