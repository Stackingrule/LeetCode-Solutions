class Solution
{
public:
    bool increasingTriplet(vector<int> &nums)
    {
        vector<int> dp(nums.size(), 1);
        for (int i = 0; i < nums.size(); ++i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (nums[j] < nums[i])
                {
                    dp[i] = max(dp[i], dp[j] + 1);
                    if (dp[i] >= 3) return true;
                }
            }
        }
        return false;
    }
};