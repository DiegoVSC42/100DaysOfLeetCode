class Solution {
    Map<Integer,List<Integer>> adjList;
    boolean[] visiting, visited;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adjList = new HashMap<>(); 
        visiting = new boolean[numCourses];
        visited = new boolean[numCourses];
        for (int[] node : prerequisites) {
            adjList.computeIfAbsent(node[0], k -> new ArrayList<>()).add(node[1]);
        }
        for (int i = 0; i < numCourses ; i++) {
            adjList.putIfAbsent(i, new ArrayList<>());
        }
        for (int i = 0; i < numCourses ; i++) {
            if (!visited[i] && hasCycle(i)) return false;
        }
        return true;
    }
    private boolean hasCycle(int node) {
        if(visiting[node]) return true;
        if(visited[node]) return false;
        visiting[node] = true;
        for (int neighbor : adjList.get(node)) {
            if (hasCycle(neighbor)) return true;
        }
        visiting[node] = false;
        visited[node] = true;
        return false;
    }
}