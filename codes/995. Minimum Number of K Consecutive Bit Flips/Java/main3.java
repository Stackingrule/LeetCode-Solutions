class Solution {
    public int minKBitFlips(int[] A, int K) {
        int ans = 0, n = A.length, flipped = 0;
        for (int i = 0; i < n; ++i) {
            if (i >= K)
                flipped -= A[i - K] / 2;
            if (flipped % 2 == A[i]) {
                if (i + K > n)
                    return -1;
                A[i] += 2;
                ++flipped;
                ++ans;
            }
        }
        return ans;
    }
}