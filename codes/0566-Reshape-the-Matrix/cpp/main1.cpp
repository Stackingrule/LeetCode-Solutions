class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& nums, int r, int c) {
        int m = nums.size(), n = nums[0].size();
        if (r * c != m * n) return nums;
        vector<vector<int>> res(r, vector<int>(c, 0));
        for (int i = 0; i < m * n; ++i) {
        	res[i / c][i % c] = nums[i / n][i % n];
        }
        return res;
    }
};