class Solution {
    private static final int EMPTY = Integer.MAX_VALUE;
    private static final int GATE = 0;
    private static final int WALL = -1;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public void wallsAndGates(int[][] rooms) {
        int m = rooms.length, n = rooms[0].length;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (rooms[i][j] == GATE) {
                    q.offer(new int[] { i, j });
                }
            }
        }

        while (!q.isEmpty()) {
            int[] t = q.poll();
            for (int i = 0; i < 4; ++i) {
                int x = t[0] + dx[i];
                int y = t[1] + dy[i];
                if (x < 0 || x >= m || y < 0 || y >= n || rooms[x][y] != EMPTY)
                    continue;
                rooms[x][y] = rooms[t[0]][t[1]] + 1;
                q.offer(new int[] { x, y });
            }
        }
    }
}