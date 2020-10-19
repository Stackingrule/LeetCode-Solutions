class Solution {
    public boolean isIdealPermutation(int[] A) {
        int n = A.length, mn = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 2; --i) {
            mn = Math.min(mn, A[i]);
            if (A[i - 2] > mn) return false;
        }
        return true;
    }
}