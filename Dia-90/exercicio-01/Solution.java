class Solution {
    Set<Integer> visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new HashSet<>();
        visiting(rooms,0);
        return visited.size() == rooms.size();
    }
    public void visiting(List<List<Integer>> rooms, int room){
        visited.add(room);
        for(int key : rooms.get(room)){
            if(!visited.contains(key))
                visiting(rooms,key);
        }
    }
}