class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        for(int i = 0 ; i < 32 ; i++){
            int bitA = ((a >> i) & 1 );
            int bitB = ((b >> i) & 1 );
            int bitC = ((c >> i) & 1 );
            if((bitA | bitB) != bitC){
                if(bitC == 1) count++;
                else count += (bitA + bitB);
            }
        }
        return count;
    }
}