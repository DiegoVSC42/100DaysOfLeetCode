public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int newBit = 0;
        for(int i = 0 ; i < 32 ; i++){
            newBit <<= 1;
            newBit += (n & 1);
            n >>= 1;
        }
        return newBit;
    }
}