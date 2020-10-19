class Solution {
    public boolean isIdealPermutation(int[] A) {
        int n = A.length, mx = Integer.MIN_VALUE;
        for (int i = 0; i < n - 2; ++i) {
            mx = Math.max(mx, A[i]);
            if (A[i + 2] < mx) return false;
        }
        return true;
    }
}