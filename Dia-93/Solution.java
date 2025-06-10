// Minimum Flips to Make a OR b Equal to c

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

// Non-overlapping Intervals

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0;
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {  
            int[] interval = intervals[i];
            if(interval[0] < prev[1]) count++;
            else prev = interval;
        }
        return count;
    }
}