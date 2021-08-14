class Solution {
    int[][] d = new int[110][110];
    int[][] q = new int[101 * 101][2];
    static int[] dx = { 0, 0, 1, 1, -1, -1, -1, 1 };
    static int[] dy = { 1, -1, 0, -1, 1, 0, -1, 1 };

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1)
            return -1;
        int n = grid.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                d[i][j] = -1;
            }
        }
        int hh = 0;
        int tt = 0;
        d[0][0] = 0;
        q[0] = new int[] { 0, 0 };
        while (hh <= tt) {
            int[] t = q[hh++];
            for (int i = 0; i < 8; ++i) {
                int x = t[0] + dx[i];
                int y = t[1] + dy[i];
                if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] == 0 && d[x][y] == -1) {
                    d[x][y] = d[t[0]][t[1]] + 1;
                    q[++tt] = new int[] { x, y };
                }
            }
        }

        return d[n - 1][n - 1] == -1 ? -1 : d[n - 1][n - 1] + 1;
    }
}