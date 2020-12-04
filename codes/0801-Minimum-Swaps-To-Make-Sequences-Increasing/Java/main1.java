class Solution {
    public int minSwap(int[] A, int[] B) {
        int n = A.length;
        int[] swap = new int[n];
        int[] noSwap = new int[n];
        Arrays.fill(swap, n);
        Arrays.fill(noSwap, n);
        swap[0] = 1;
        noSwap[0] = 0;
        for (int i = 1; i < n; ++i) {
            if (A[i] > A[i - 1] && B[i] > B[i - 1]) {
                swap[i] = swap[i - 1] + 1;
                noSwap[i] = noSwap[i - 1];
            }
            if (A[i] > B[i - 1] && B[i] > A[i - 1]) {
                swap[i] = Math.min(swap[i], noSwap[i - 1] + 1);
                noSwap[i] = Math.min(noSwap[i], swap[i - 1]);
            }
        }

        return Math.min(swap[n - 1], noSwap[n - 1]);
    }
}