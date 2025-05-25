class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.offer(num);
            heapResize();
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        heapResize();
        return minHeap.peek();
    }

    public void heapResize(){
        if(minHeap.size() > k) minHeap.poll();
    }
}