class Solution {
    public int maxTurbulenceSize(int[] A) {
        int res = 1, n = A.length;
        int[] dec = new int[n];
        int[] inc = new int[n];
        Arrays.fill(dec, 1);
        Arrays.fill(inc, 1);
        for (int i = 1; i < n; ++i) {
            if (A[i - 1] > A[i]) {
                dec[i] = inc[i - 1] + 1;
            } else if (A[i - 1] < A[i]) {
                inc[i] = dec[i - 1] + 1;
            }
            res = Math.max(res, Math.max(dec[i], inc[i]));
        }
        return res;
    }
}