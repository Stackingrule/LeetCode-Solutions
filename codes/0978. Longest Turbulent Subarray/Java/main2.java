class Solution {
    public int maxTurbulenceSize(int[] A) {
        int res = 1, n = A.length, inc = 1, dec = 1;
        for (int i = 1; i < n; ++i) {
            if (A[i] < A[i - 1]) {
                dec = inc + 1;
                inc = 1;
            } else if (A[i] > A[i - 1]) {
                inc = dec + 1;
                dec = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            res = Math.max(res, Math.max(inc, dec));
        }
        return res;
    }
}