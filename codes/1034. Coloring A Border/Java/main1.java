class Solution {
    public static int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
        int[][] dirs = new int[][] { { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, 0 } }; // 方向,顺时针
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        boolean[][] visit = new boolean[grid.length][grid[0].length];
        int initColor = grid[r0][c0];
        visit[r0][c0] = true;
        queue.offer(new int[] { r0, c0 });
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0], y = point[1];
            if (inBorder(grid, x, y)) {
                grid[x][y] = color;
            }
            for (int[] dir : dirs) {
                int nx = x + dir[0], ny = y + dir[1];
                if (nx < 0 || nx >= grid.length || ny < 0 || ny >= grid[0].length || visit[nx][ny]) {
                    continue;
                }
                // 如果颜色与初始色相同，为联通点；如果该点的四周颜色都已经是color，说明为内部点，非边界点
                if (grid[nx][ny] == initColor) {
                    queue.offer(new int[] { nx, ny });
                    visit[nx][ny] = true;
                } else { // 如果下一步点颜色不同，说明该点为联通区域的边界点，该点可以着色
                    grid[x][y] = color;
                }
            }
        }
        return grid;
    }

    // 判断为边界
    private static boolean inBorder(int[][] grid, int x, int y) {
        return x == 0 || y == 0 || x == grid.length - 1 || y == grid[0].length - 1;
    }
}
