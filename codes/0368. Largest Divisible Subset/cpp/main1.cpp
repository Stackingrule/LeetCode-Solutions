class Solution
{
public:
    vector<int> largestDivisibleSubset(vector<int> &nums)
    {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        vector<int> dp(n, 0);
        vector<int> parent(n, 0);
        int mx = 0, mx_idx = 0;
        vector<int> ans;
        for (int i = n - 1; i >= 0; --i)
        {
            for (int j = i; j < n; ++j)
            {
                if (nums[j] % nums[i] == 0 && dp[i] < dp[j] + 1)
                {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                    if (mx < dp[i])
                    {
                        mx = dp[i];
                        mx_idx = i;
                    }
                }
            }
        }
        for (int i = 0; i < mx; ++i)
        {
            ans.push_back(nums[mx_idx]);
            mx_idx = parent[mx_idx];
        }
        return ans;
    }
};