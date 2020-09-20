class Solution {
    int pathCount = 0;
    int [][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int uniquePathsIII(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int startX = -1;
        int startY = -1;
        int endX = -1;
        int endY = -1;
        int zeroCount = 0;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 1){
                    startX = i;
                    startY = j;
                }else if(grid[i][j] == 2){
                    endX = i;
                    endY = j;
                }else if(grid[i][j] == 0){
                    zeroCount++;
                }
            }
        }

        dfs(grid, startX, startY, endX, endY, 0, zeroCount, new boolean[m][n]);
        return pathCount;
    }

    private void dfs(int [][] grid, int i, int j, int endX, int endY, int count, int targetCount, boolean [][] visited){
        if(i < 0 || i >= grid.length || j < 0 || j>= grid[0].length || grid[i][j] == -1 || visited[i][j]){
            return;
        }

        if(grid[i][j] == 2){
            if(count == targetCount){
                pathCount++;
            }

            return;
        }

        if(grid[i][j] == 0){
            count++;
        }

        visited[i][j] = true;
        for(int [] dir : dirs){
            int dx = i + dir[0];
            int dy = j + dir[1];
            dfs(grid, dx, dy, endX, endY, count, targetCount, visited);
        }

        visited[i][j] = false;
    }
}