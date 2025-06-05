// Find the Highest Altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int[] largestSoFar = new int[gain.length + 1];
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < gain.length ;i++){
            largestSoFar[i + 1] = largestSoFar[i] + gain[i];
            max = Math.max(largestSoFar[i],max);
        }
        return  Math.max(largestSoFar[gain.length],max);
    }
}

// Find the Difference of Two Arrays

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);
        answer.get(0).addAll(new ArrayList<>(set1));
        answer.get(0).removeAll(set2);
        answer.get(1).addAll(new ArrayList<>(set2));
        answer.get(1).removeAll(set1);
        
        return answer;
    }
}

// Number of Recent Calls

class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(!queue.isEmpty() && queue.peek() < (t - 3000)){
            queue.poll();
        }
        return queue.size();
    }
}