class Solution
{
public:
    int numIdenticalPairs(vector<int> &nums)
    {
        int ans = 0;
        vector<int> f(101);
        for (int i = 0; i < nums.size(); ++i)
        {
            ans += f[nums[i]]++;
        }
        return ans;
    }
};