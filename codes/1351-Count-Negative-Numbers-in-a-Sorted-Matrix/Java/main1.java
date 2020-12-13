class Solution {
    public int countNegatives(int[][] grid) {
        int M = grid.length, N = grid[0].length;
        int c = N - 1, r = 0;
        int ans = 0;
        while (r < M) {
            if (c >= 0 && grid[r][c] < 0) {
                --c;
            } else {
                ans += N - c - 1;
                ++r;
                c = N - 1;
            }
        }
        return ans;
    }}