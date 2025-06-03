class Solution {
    int rows;
    int cols;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        rows = heights.length;
        cols = heights[0].length;

        Set<List<Integer>> pacific = new HashSet<>();
        Set<List<Integer>> atlantic = new HashSet<>();

        for(int i = 0 ; i < cols ; i++){
            dfs(0,i,pacific,heights[0][i],heights);
            dfs(rows-1,i,atlantic,heights[rows - 1][i],heights);
        }
        
        for(int i = 0 ; i < rows ; i++){
            dfs(i,0,pacific,heights[i][0],heights);
            dfs(i,cols - 1,atlantic,heights[i][cols - 1],heights);
        }

        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                List<Integer> cur = Arrays.asList(i,j);
                if(pacific.contains(cur) && atlantic.contains(cur)){
                    result.add(cur);
                }
            }
        }
        return result;
    }

    public void dfs(int row, int col, Set<List<Integer>> visit, int prevHeight,int[][] heights){
        if(
            visit.contains(Arrays.asList(row,col))  || 
            row < 0             ||  col < 0         || 
            row == rows         ||  col == cols     || 
            heights[row][col]   <   prevHeight 
        ) return;
        
        visit.add(Arrays.asList(row,col));
        dfs(row + 1,col,visit,heights[row][col],heights);
        dfs(row - 1,col,visit,heights[row][col],heights);
        dfs(row,col + 1,visit,heights[row][col],heights);
        dfs(row,col - 1,visit,heights[row][col],heights);
    }
}