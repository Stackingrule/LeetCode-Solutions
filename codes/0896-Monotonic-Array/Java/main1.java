class Solution {
    public boolean isMonotonic(int[] A) {
        boolean inc = true, dec = true;
        for (int i = 1; i < A.length; ++i) {
            inc &= (A[i - 1] <= A[i]);
            dec &= (A[i - 1] >= A[i]);
            if (!inc && !dec) {
                return false;
            }
        }
        return true;
    }
}