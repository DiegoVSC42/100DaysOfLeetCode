//Keys and Rooms

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

// Rotting Oranges

class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int freshOranges = 0;

        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(grid[i][j] == 2) queue.offer(new int[]{i,j});
                if(grid[i][j] == 1) freshOranges++;
            }
        }
        
        int time = 0;
        int[][] directions = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };

        while (!queue.isEmpty() && freshOranges > 0) {
            int currentLevelSize = queue.size();
            boolean infectedAny = false;
            for (int i = 0; i < currentLevelSize; i++) {
                int[] curr = queue.poll();
                int r = curr[0], c = curr[1];
                for (int[] dir : directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        freshOranges--;
                        queue.offer(new int[]{nr,nc});
                        infectedAny = true;
                    }    
                }
            }
            if(infectedAny) time++;
        }
        return freshOranges == 0 ? time : -1;
    }
}

