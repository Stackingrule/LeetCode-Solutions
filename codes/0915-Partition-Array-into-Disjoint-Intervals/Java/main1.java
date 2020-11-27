class Solution {
    public int partitionDisjoint(int[] A) {
        int[] maArr = new int[A.length + 1];
        int[] miArr = new int[A.length + 1];
        maArr[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            maArr[i] = Math.max(maArr[i - 1], A[i]);
        }
        miArr[A.length - 1] = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            miArr[i] = Math.min(miArr[i + 1], A[i]);
        }
        int ans = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (maArr[i] <= miArr[i + 1]) {
                ans = i;
                break;
            }
        }
        return ans + 1;
    }
}