class Solution {
    public int smallestRangeI(int[] A, int K) {
        int mx = A[0], mn = A[0];
        for (int num : A) {
            mn = Math.min(num, mn);
            mx = Math.max(num, mx);
        }
        return Math.max(0, mx - mn - 2 * K);
    }
}