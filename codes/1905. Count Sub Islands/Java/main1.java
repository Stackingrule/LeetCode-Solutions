class Solution {
    int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    int R, C;
    int[][] grid1;
    int[][] grid2;

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        R = grid2.length;
        C = grid2[0].length;
        this.grid1 = grid1;
        this.grid2 = grid2;
        int res = 0;
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (grid2[r][c] == 1 && dfs(r, c)) {
                    res++;
                }
            }
        }
        return res;
    }


    private boolean dfs(int r, int c) {
        boolean f = true;
        grid2[r][c] = 0;
        if (grid1[r][c] != 1) f = false;
        for (int[] d : dirs) {
            int nr = r + d[0], nc = c + d[1];
            if (nr >= 0 && nr < R && nc >= 0 && nc < C && grid2[nr][nc] == 1) {
                if (!dfs(nr, nc)) f = false;
            }
        }
        return f;
    }
}
