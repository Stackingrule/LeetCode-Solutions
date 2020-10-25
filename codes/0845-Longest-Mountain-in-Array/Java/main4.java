class Solution {
    public int longestMountain(int[] A) {
        int res = 0, n = A.length;
        for (int i = 1; i < n - 1; ++i) {
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
                int left = i - 1, right = i + 1;
                while (left > 0 && A[left - 1] < A[left]) --left;
                while (right < n - 1 && A[right] > A[right + 1]) ++right;
                res = Math.max(res, right - left + 1);
            }
        }
        return res;
    }
}