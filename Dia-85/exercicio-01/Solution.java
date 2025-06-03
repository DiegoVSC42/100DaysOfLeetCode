class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        int lastEnd = intervals[0][1];
        for(int i = 1 ; i < intervals.length ; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start <= lastEnd){
                list.get(list.size() - 1)[1] = Math.max(lastEnd,end); 
                lastEnd = list.get(list.size() - 1)[1];
            }else{
                list.add(intervals[i]);
                lastEnd = end;
            }
        }

        int[][] array = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}