class Solution {
    public int longestOnes(int[] A, int K) {
        int res = 0;
        int left = 0;
        int zero = 0;
        int N = A.length;
        for (int right = 0; right < N; ++right) {
            if (A[right] == 0)
                ++zero;
            while (zero > K) {
                if (A[left++] == 0)
                    --zero;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}