class Solution
{
public:
    vector<int> smallerNumbersThanCurrent(vector<int> &nums)
    {
        vector<int> cnt(101, 0);
        vector<int> ans(nums.size(), 0);
        for (int i = 0; i < nums.size(); i++)
            cnt[nums[i]]++;
        for (int i = 1; i < 101; i++)
            cnt[i] += cnt[i - 1];
        for (int i = 0; i < nums.size(); i++)
        {
            if (nums[i] == 0)
                ans[i] = 0;
            else
                ans[i] = cnt[nums[i] - 1];
        }
        return ans;
    }
};