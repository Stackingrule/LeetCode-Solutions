class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = m > 0 ? nums[0].length : 0;
        if (r * c != m * n) return nums;
        int[][] res = new int[r][c];
        for (int i = 0; i < m * n; ++i) {
        	res[i / c][i % c] = nums[i / n][i % n];
        }
        return res;
    }
}