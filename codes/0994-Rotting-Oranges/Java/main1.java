class Solution {
    public int orangesRotting(int[][] grid) {
        int nr = grid.length, nc = grid[0].length;
        // 腐烂的步数
        int step = 0;
        // 上一步（上一分钟）是否有新腐蚀的结点，没有新腐蚀的结点则结束
        boolean newRot = true;
        while (newRot) {
            newRot = false;
            int lastRotValue = 2 + step;
            for (int i = 0; i < nr; i++) {
                for (int j = 0; j < nc; j++) {
                    // 从上次腐烂结点（值为lastRotValue）开始向周围腐烂1步，标为 lastRotValue + 1
                    if (grid[i][j] == lastRotValue) {
                        newRot = rot1Step(grid, i, j, lastRotValue + 1) || newRot;
                    }
                }
            }
            step ++;
        }
        // 若还有未腐烂的结点，返回-1
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return step - 1;
    }
    // 从 row,column 开始向上下左右腐烂1步，标为 newValue, 如果有新腐烂的结点返回true
    private boolean rot1Step(int[][] grid, int row, int column, int newValue) {
        int nr = grid.length, nc = grid[0].length;
        boolean ret = false;
        // 结点上下左右的新鲜结点入队
        if (row - 1 >= 0 && grid[row - 1][column] == 1) { // 上
            grid[row - 1][column] = newValue;
            ret = true;
        }
        if (column + 1 < nc && grid[row][column + 1] == 1) { // 右
            grid[row][column + 1] = newValue;
            ret = true;
        }
        if (row + 1 < nr && grid[row + 1][column] == 1) { // 下
            grid[row + 1][column] = newValue;
            ret = true;
        }
        if (column - 1 >= 0 && grid[row][column - 1] == 1) { // 左
            grid[row][column - 1] = newValue;
            ret = true;
        }
        return ret;
    }
}