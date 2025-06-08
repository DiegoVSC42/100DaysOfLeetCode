// N-th Tribonacci Number

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

// Domino and Tromino Tiling

class Solution {
    //(2*res(n-1)) + res(n-3)
    public int numTilings(int n) {
        if(n == 0 || n == 1 || n == 2) return n;
        long[] tilings = new long[n + 1];
        int mod = 1_000_000_007;
        tilings[0] = 0;
        tilings[1] = 1;
        tilings[2] = 2;
        tilings[3] = 5;
        for(int i = 4 ; i <= n ; i++){
            tilings[i] =  ((2 * tilings[i - 1]) + tilings[i - 3]) % mod;
        }
        return (int) tilings[n];
    }
}