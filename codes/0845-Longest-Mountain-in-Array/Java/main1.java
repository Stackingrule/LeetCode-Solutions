class Solution {
    public int longestMountain(int[] A) {
        int n = A.length, res = 0;
        int[] up = new int[n];
        int[] down = new int[n];

        for (int i = n - 2; i >= 0; --i) {
            if (A[i] > A[i + 1]) down[i] = down[i + 1] + 1;
        }
        for (int i = 1; i < n; ++i) {
            if (A[i] > A[i - 1]) up[i] = up[i - 1] + 1;
            if (up[i] > 0 && down[i] > 0) res = Math.max(res, up[i] + down[i] + 1);
        }

        return res;
    }
}