class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;

        int r = coins.length;
        int c = amount + 1;
        int inf = Integer.MAX_VALUE - 1;

        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = inf;
            }
        }

        for (int i = 0; i < r; i++) {
            m[i][0] = 0;
        }

        for(int i = 0; i < r ; i++){
            for(int j = 0 ; j <= c - 1 ; j++){
                if(coins[i] <= j){
                    int include = inf;
                    if(m[i][j - coins[i]] != inf){
                        include = m[i][j- coins[i]] + 1;
                    }
                    if(i == 0){
                        m[i][j] = include;
                    }else{
                        m[i][j] = Math.min(include, m[i - 1][j]);
                    }
                    
                }else if (i > 0){
                    m[i][j] = m[i - 1][j];
                }
            }
        }
        int result = m[r - 1][c - 1];
        return result == inf ? -1 : result;
    }
}