// find judge

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

// find center

class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        int center = 0;
        for (int[] node : edges) {
            adjList.computeIfAbsent(node[0], k -> new ArrayList<>()).add(node[1]);
            adjList.computeIfAbsent(node[1], k -> new ArrayList<>()).add(node[0]);
        }
        for (Map.Entry<Integer,List<Integer>> entry : adjList.entrySet()) {
            if (entry.getValue().size() == edges.length) {
                center = entry.getKey();
            }
        }
        return center;
    }
}