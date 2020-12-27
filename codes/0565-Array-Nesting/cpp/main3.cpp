class Solution
{
public:
    int arrayNesting(vector<int> &nums)
    {
        int n = nums.size(), res = 0;
        for (int i = 0; i < n; ++i)
        {
            int cnt = 1;
            while (nums[i] != i)
            {
                swap(nums[i], nums[nums[i]]);
                ++cnt;
            }
            res = max(res, cnt);
        }
        return res;
    }
};