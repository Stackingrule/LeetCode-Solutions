class Solution
{
public:
    bool increasingTriplet(vector<int> &nums)
    {
        if (nums.size() < 3)
            return false;
        int n = nums.size();
        vector<int> f(n, nums[0]), b(n, nums.back());
        for (int i = 1; i < n; ++i)
        {
            f[i] = min(f[i - 1], nums[i]);
        }
        for (int i = n - 2; i >= 0; --i)
        {
            b[i] = max(b[i + 1], nums[i]);
        }
        for (int i = 0; i < n; ++i)
        {
            if (nums[i] > f[i] && nums[i] < b[i])
                return true;
        }
        return false;
    }
};