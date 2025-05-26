class Solution {

    private PriorityQueue<Integer> minHeap;

    public int[] topKFrequent(int[] nums, int k) {
        minHeap = new PriorityQueue<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.merge(num,1,Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(minHeap.size() == 0 || minHeap.size() < k){
                minHeap.offer(entry.getValue());
            }else if(entry.getValue() > minHeap.peek()){
                minHeap.poll();
                minHeap.offer(entry.getValue());
            }
        }
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for(Integer num : minHeap){
                if(entry.getValue().equals(num) && !res.contains(entry.getKey())){
                    res.add(entry.getKey());
                }
            }
        }

        int[] array = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            array[i] = res.get(i);
        }
        return array;
    }
}

