class Solution {
    Set<String> visit = new HashSet<>();
    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1' && !visit.contains(i + "," + j)){
                    dfs(i,j,grid);
                    islands += 1;
                }
            }
        }
        return islands;
    }
    public void dfs(int row, int col,char[][] grid){
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') 
            return;
        grid[row][col] = '0';
        dfs(row + 1, col, grid);
        dfs(row - 1, col, grid);
        dfs(row, col + 1, grid);
        dfs(row, col - 1, grid);
    }
    public void bfs(int row, int col,char[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;
        Deque<int[]> queue = new ArrayDeque<>();
        visit.add(row + "," + col);
        queue.addLast(new int[] {row,col});
        while(queue.size() > 0){
            int[] pos = queue.removeFirst();
            int r = pos[0];
            int c = pos[1];
            int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
            for (int i = 0; i < directions.length; i++) {
                int curRow = r + directions[i][0];
                int curCol = c + directions[i][1];
                if(
                    curRow >= 0 && curCol >= 0 &&
                    curRow < rows && curCol < cols && 
                    grid[curRow][curCol] == '1' && 
                    !visit.contains(curRow + "," + curCol)){

                    queue.addLast(new int[] {curRow,curCol});
                    visit.add(curRow + "," + curCol);
                }
                
            }
        }
    }
}