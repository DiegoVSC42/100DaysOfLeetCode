// Merge intervals

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

//Longest Repeating Character Replacement

class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int left = 0;
        int right = 0;
        int maxCount = 0;
        while (right < s.length()) {
            map.merge(s.charAt(right), 1, Integer::sum);
            maxCount = Math.max(maxCount, map.get(s.charAt(right)));

            int windowSize = right - left + 1;

            if (windowSize - maxCount > k) {
                map.merge(s.charAt(left), -1, Integer::sum);
                left++;
            } else {
                result = Math.max(result, windowSize);
            }

            right++;
        }
        return result;
    }
}
