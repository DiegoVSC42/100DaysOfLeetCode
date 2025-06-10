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