class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int res = 0, sum = 0, left = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            sum += A[i];
            while (left < i && sum > S) {
                sum -= A[left++];
            }
            if (sum < S) continue;
            if (S == sum) ++res;
            for (int j = left; j < i && A[j] == 0; ++j) {
                ++res;
            }
        }
        return res;
    }
}