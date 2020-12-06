class Solution {
public:
    int smallestRangeI(vector<int>& A, int K) {
        int mx = A[0], mn = A[0];
        for (int num : A) {
            mx = max(num, mx);
            mn = min(num, mn);
        }
        return max(0, mx - mn - 2 * K);
    }
};