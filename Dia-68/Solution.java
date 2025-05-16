class Solution {
    Map<Integer,List<Integer>> adjList;
    int[] visitInfo; // 0 = not visited | 1 = visiting | -1 = visited
    int[] courseOrder;
    int idx;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        adjList = new HashMap<>(); 
        visitInfo = new int[numCourses];
        courseOrder = new int[numCourses];
        idx = 0;
        for (int[] node : prerequisites) {
            adjList.computeIfAbsent(node[0], k -> new ArrayList<>()).add(node[1]);
        }
        for (int i = 0; i < numCourses ; i++) {
            adjList.putIfAbsent(i, new ArrayList<>());
        }
        for (int i = 0; i < numCourses ; i++) {
            if(hasCycle(i)) return new int[0];
        }
        return courseOrder;
    }
    private boolean hasCycle(int node) {
        if(visitInfo[node] == 1) return true;
        if(visitInfo[node] == -1) return false;
        visitInfo[node] = 1;
        for (int neighbor : adjList.get(node)) {
            if (hasCycle(neighbor)) return true;
        }
        visitInfo[node] = -1;
        courseOrder[idx] = node;
        idx++;
        return false;
    }
}