class Solution {
    public int matrixScore(int[][] A) {
        int m = A.length, n = A[0].length;
        int res = (1 << (n - 1)) * m;
        for (int j = 1; j < n; ++j) {
            int cnt = 0;
            for (int i = 0; i < m; ++i) {
                if (A[i][j] == A[i][0])
                    cnt++;
            }
            res += Math.max(cnt, m - cnt) * (1 << (n - 1 - j));
        }
        return res;
    }
}