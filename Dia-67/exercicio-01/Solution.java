class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1) return 1;
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        Map<Integer,Integer> trustCounter = new HashMap<>();
        int maxKey = 0, maxVal = 0;
        for (int[] node : trust) {
            adjList.computeIfAbsent(node[0], k -> new ArrayList<>()).add(node[1]);
            trustCounter.merge(node[1],1,Integer::sum);
            if(maxVal < trustCounter.get(node[1])){
                maxKey = node[1];
                maxVal = trustCounter.get(node[1]);
            }
        }
        return maxVal == n - 1 && !adjList.containsKey(maxKey)? maxKey : -1;
    }
}