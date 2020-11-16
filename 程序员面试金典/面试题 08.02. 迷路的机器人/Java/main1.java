class Solution {
    public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
        
        List<List<Integer>> route = new ArrayList<>();
        int h = obstacleGrid.length - 1;
        int w = obstacleGrid[0].length - 1;
        
        if (obstacleGrid[0][0] == 1 || obstacleGrid[h][w] == 1) {
            return route;
        }

        boolean[][] dp = new boolean[h + 1][w + 1];
        dp[0][0] = true;
        dp[h][w] = true;
        int x = 0;
        int y = 0;
        while (x < h || y < w) {
            dp[x][y] = true;
            if (x < h && obstacleGrid[x + 1][y] == 0) {
                x++;
                continue;
            }
            if (y < w && obstacleGrid[x][y + 1] == 0) {
                y++;
                continue;
            }
            if (x == 0 && y == 0) {
                return route;
            }
            dp[x][y] = false;
            obstacleGrid[x][y] = 1;
            if (x > 0 && dp[x - 1][y]) {
                x--;
            } else {
                y--;
            }
        }
        x = 0;
        y = 0;
        while (x < h || y < w) {
            route.add(Arrays.asList(x, y));
            if (x < h && dp[x + 1][y]) {
                x++;
            } else {
                y++;
            }
        }
        route.add(Arrays.asList(x, y));
        return route;
    }
}