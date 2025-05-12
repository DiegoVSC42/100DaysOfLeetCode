class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return node;
        Map<Integer, Node> clones = new HashMap<>();
        Deque<Node> queue = new ArrayDeque<>();
        queue.addLast(node);
        clones.put(node.val,new Node(node.val,new ArrayList<>()));
        while(queue.size() > 0){
            Node current = queue.pollFirst();
            Node currentClone = clones.get(current.val);
            for(Node n : current.neighbors){
                if(!clones.containsKey(n.val)){
                    clones.put(n.val,new Node(n.val,new ArrayList<>()));
                    queue.addLast(n);
                }
                currentClone.neighbors.add(clones.get(n.val));
            }
        }
        return clones.get(node.val);
    }
}