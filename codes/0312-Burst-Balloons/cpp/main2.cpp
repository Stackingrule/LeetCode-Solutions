class Solution
{
public:
    int maxCoins(vector<int> &nums)
    {
        int n = nums.size();
        nums.insert(nums.begin(), 1);
        nums.push_back(1);
        vector<vector<int>> dp(n + 2, vector<int>(n + 2, 0));
        return burst(nums, dp, 1, n);
    }
    int burst(vector<int> &nums, vector<vector<int>> &dp, int i, int j)
    {
        if (i > j)
            return 0;
        if (dp[i][j] > 0)
            return dp[i][j];
        int res = 0;
        for (int k = i; k <= j; ++k)
        {
            res = max(res, nums[i - 1] * nums[k] * nums[j + 1] + burst(nums, dp, i, k - 1) + burst(nums, dp, k + 1, j));
        }
        dp[i][j] = res;
        return res;
    }
};