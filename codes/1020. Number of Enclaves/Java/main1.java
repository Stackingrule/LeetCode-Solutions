import java.util.Queue;

class Solution {
    public int numEnclaves(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int ans = 0;
        int m = grid.length, n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                ans += grid[i][j];
                if (i * j == 0 || i == m - 1 || j == n - 1) {
                    q.offer(new int[] { i, j });
                }
            }
        }

        while (!q.isEmpty()) {
            int[] t = q.poll();
            int x = t[0], y = t[1];
            if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != 1)
                continue;
            grid[x][y] = 0;
            --ans;
            q.offer(new int[] { x + 1, y });
            q.offer(new int[] { x - 1, y });
            q.offer(new int[] { x, y + 1 });
            q.offer(new int[] { x, y - 1 });
        }

        return ans;
    }
}