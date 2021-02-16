class Solution {
    public int lenLongestFibSubseq(int[] A) {
        int res = 0, n = A.length;
        HashMap<Integer, Integer> m = new HashMap();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; ++i) {
            // m[A[i]] = i;
            m.put(A[i], i);
            for (int j = 0; j < i; ++j) {
                int k = m.containsKey(A[i] - A[j]) ? m.get(A[i] - A[j]) : -1;
                dp[j][i] = (A[i] - A[j] < A[j] && k >= 0) ? (dp[k][j] + 1) : 2;
                res = Math.max(res, dp[j][i]);
            }
        }
        return (res > 2) ? res : 0;
    }

}