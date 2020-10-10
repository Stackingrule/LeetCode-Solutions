class Solution {
    public boolean validMountainArray(int[] A) {
        int n = A.length, i = 0, j = n- 1;
        while (i < n - 1 && A[i] < A[i + 1]) ++i;
        while (j > 0 && A[j - 1] > A[j]) --j;
        return i > 0 && j < n- 1 && i == j;
    }
}