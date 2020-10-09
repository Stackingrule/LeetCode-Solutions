class Solution {
    public boolean isMonotonic(int[] A) {
        int inc = 1, dec = 1;
        int n = A.length;
        for (int i = 1; i < n; ++i) {
            if (A[i - 1] <= A[i]) ++inc;
            if (A[i - 1] >= A[i]) ++dec;
        }
        return (inc == n) || (dec == n);
    }
}