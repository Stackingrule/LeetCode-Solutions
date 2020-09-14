class Solution
{
public:
    int dominantIndex(vector<int> &nums)
    {
        int mx = INT_MIN, mxId = 0;
        for (int i = 0; i < nums.size(); ++i)
        {
            if (mx < nums[i])
            {
                mx = nums[i];
                mxId = i;
            }
        }
        for (int num : nums)
        {
            if (mx != num && mx - num < num)
                return -1;
        }
        return mxId;
    }
};