class Solution
{
public:
    int pivotIndex(vector<int> &nums)
    {
        int sum = accumulate(nums.begin(), nums.end(), 0);
        int curSum = 0, n = nums.size();
        for (int i = 0; i < n; ++i)
        {
            if (sum - nums[i] == curSum * 2)
                return i;
            curSum += nums[i];
        }
        return -1;
    }
};