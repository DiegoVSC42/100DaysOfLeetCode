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