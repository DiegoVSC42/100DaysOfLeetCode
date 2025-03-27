class Solution {
    public int climbStairs(int n) {
        int[] x = new int[n+1];
        x[0] = 1;
        x[1] = 1;
        for(int i = 2; i < n+1;i++){
            x[i] = x[i-1] + x[i-2];
        }
        return x[n];
    }
}
