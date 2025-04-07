class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n > 0){
            count = (n & 1) == 1 ? count + 1 : count;
            n >>= 1;
        }
        return count;
    }
}