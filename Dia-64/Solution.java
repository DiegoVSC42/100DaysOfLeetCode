class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Map<Integer,Integer>> table = new HashMap<>();
        for(int[] t : times){
            table.computeIfAbsent(t[0], key -> new HashMap<>()).put(t[1], t[2]);
        }
        Map<Integer,Integer> distances = new HashMap<>();
        distances.put(k,0);
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
		minHeap.offer(new int[]{0, k});
        while(minHeap.size() > 0){
            int[] current = minHeap.poll();
            int distance = current[0];
            int node = current[1];
            Map<Integer, Integer> row = table.get(node);
            if(row != null){
                for(Map.Entry<Integer,Integer> entry : row.entrySet()){
                    int neighbor = entry.getKey();
                    int weight = entry.getValue();
                    int existing = distances.getOrDefault(neighbor,Integer.MAX_VALUE);

                    if(distance + weight < existing){
                        distances.put(neighbor, distance + weight);
                        minHeap.offer(new int[]{distance + weight, neighbor});
                    }
                }
            }
        }
		int max = -1;
        if (distances.size() < n) return max;
		for (int d : distances.values()) {
			max = Math.max(max, d);
		}
        return max == 0 ? -1 : max;
    }
}