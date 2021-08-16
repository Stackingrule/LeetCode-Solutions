class Solution {
    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) return 0;
        int ans = 0;
        int m = heightMap.length, n = heightMap[0].length;
        int mx = Integer.MIN_VALUE;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Grid> q = new PriorityQueue<>(cmp);
        int[][] dir = { { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 } };
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    q.offer(new Grid(i, j, heightMap[i][j]));
                    visited[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            Grid t = q.poll();
            for (int i = 0; i < 4; ++i) {
                int x = t.x + dir[i][0];
                int y = t.y + dir[i][1];
                int h = t.h;
                mx = Math.max(mx, h);
                if (x >= 0 && x < m && y >= 0 && y < n && !visited[x][y]) {
                    if (heightMap[x][y] < mx) {
                        ans += mx - heightMap[x][y];
                    }
                    visited[x][y] = true;
                    q.offer(new Grid(x, y, heightMap[x][y]));
                }
            }
        }

        return ans;
    }

    static Comparator<Grid> cmp = new Comparator<Grid>() {
        @Override
        public int compare(Grid o1, Grid o2) {
            return o1.h - o2.h;
        }
    };
    static class Grid {
        int x;
        int y;
        int h;

        Grid(int x, int y, int h) {
            this.x = x;
            this.y = y;
            this.h = h;
        }


    }
}