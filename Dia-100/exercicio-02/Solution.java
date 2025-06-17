class Solution {
    public int equalPairs(int[][] grid) {
        Map<Integer,List<Integer>> cols = new HashMap<>();
        Map<Integer,List<Integer>> rows = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            rows.put(i,new ArrayList<>());
            for (int j = 0; j < grid[i].length; j++) {
                rows.get(i).add(grid[i][j]);
                cols.putIfAbsent(j,new ArrayList<>());
                cols.get(j).add(grid[i][j]);
            }
        }
        int count = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(rows.get(i).equals(cols.get(j))) count++;
            }
        }

        return count;
    }
}