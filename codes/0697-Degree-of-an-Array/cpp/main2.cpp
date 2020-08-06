class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        int n = nums.size(), res = INT_MAX, degree = 0;
        unordered_map<int, int> m, startIdx;
        for (int i = 0; i < n; ++i) {
            ++m[nums[i]];
            if (!startIdx.count(nums[i])) startIdx[nums[i]] = i;
            if (m[nums[i]] == degree) {
                res = min(res, i - startIdx[nums[i]] + 1);
            } else if (m[nums[i]] > degree) {
                res = i - startIdx[nums[i]] + 1;
                degree = m[nums[i]];
            }
        }
        return res;
    }
};