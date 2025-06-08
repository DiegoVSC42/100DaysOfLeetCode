class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int[] tribArr = new int[n + 1];
        tribArr[0] = 0;
        tribArr[1] = 1;
        tribArr[2] = 1;
        for(int i = 3 ; i <= n ; i++){
            tribArr[i] = tribArr[i - 1] + tribArr[i - 2] + tribArr[i - 3];
        }
        return tribArr[n];
    }
}