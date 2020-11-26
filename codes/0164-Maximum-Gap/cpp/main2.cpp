
class Solution
{
public:
    int maximumGap(vector<int> &nums)
    {
        if (nums.size() < 2)
            return 0;

        sort(nums.begin(), nums.end());
        int maxGap = 0;
        for (int i = 1; i < nums.size(); i++)
        {
            if (abs(nums[i - 1] - nums[i]) > maxGap)
                maxGap = abs(nums[i - 1] - nums[i]);
        }
        return maxGap;
    }
};