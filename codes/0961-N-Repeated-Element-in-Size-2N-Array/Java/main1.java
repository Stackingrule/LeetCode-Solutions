class Solution {
    public static int repeatedNTimes(int[] A) {
    int len = A.length;
    for (int i = 0; i < len - 2; i++) {
        if (A[i] == A[i + 1] || A[i] == A[i + 2]) {
        return A[i];
        }
    }
    return A[len - 1];
    }
}