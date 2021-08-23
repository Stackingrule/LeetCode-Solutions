class Solution {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1}; 
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length, n = isWater[0].length;
        int[][] ans = new int[m][n];
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (isWater[i][j] == 1) {
                    ans[i][j] = 0;
                    q.offer(new int[] { i, j });
                } else {
                    ans[i][j] = -1;
                }
            }
        }

        int high = 0;
        while (!q.isEmpty()) {
            high++;
            int size = q.size();
            for (int i = 0; i < size; ++i) {
                int[] t = q.poll();
                for (int di = 0; di < 4; ++di) {
                    int x = t[0] + dx[di];
                    int y = t[1] + dy[di];
                    if (x >= 0 && x < m && y >= 0 && y < n && ans[x][y] == -1) {
                        ans[x][y] = high;
                        q.offer(new int[] {x, y});
                    }
                }
            }
        }

        return ans;
    }
}