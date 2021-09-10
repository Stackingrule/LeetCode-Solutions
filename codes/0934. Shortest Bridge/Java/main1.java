class Solution {

    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};
    public int shortestBridge(int[][] grid) {
        int ans = 0;
        int m = grid.length, n = grid[0].length;
        Queue<Integer> qu = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 0) continue;
                grid[i][j] = 2;
                qu.offer(i * n + j);
                break;
            }
            if (!qu.isEmpty()) break;
        }

        while (!qu.isEmpty()) {
            int t = qu.poll();
            q.offer(t);
            for (int i = 0; i < 4; ++i) {
                int x = t / n + dx[i];
                int y = t % n + dy[i];
                if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0 || grid[x][y] == 2) continue;
                grid[x][y] = 2;
                qu.offer(x * n + y);
            }
        }

        while (!q.isEmpty()) {
            for (int i = q.size(); i > 0; -- i) {
                int t = q.poll();
                for (int k = 0; k < 4; ++k) {
                    int x = t / n + dx[k];
                    int y = t % n + dy[k];
                    if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 2) continue;
                    if (grid[x][y] == 1) return ans;
                    grid[x][y] = 2;
                    q.offer(x * n + y);
                }
            }
            ++ans;
        }
        return ans;
    }
}