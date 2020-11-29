class Solution
{
public:
    vector<string> findRelativeRanks(vector<int> &nums)
    {
        int n = nums.size(), cnt = 1;
        vector<string> res(n, "");
        map<int, int> m;
        for (int i = 0; i < n; ++i)
        {
            m[nums[i]] = i;
        }
        for (auto it = m.rbegin(); it != m.rend(); ++it)
        {
            if (cnt == 1)
                res[it->second] = "Gold Medal";
            else if (cnt == 2)
                res[it->second] = "Silver Medal";
            else if (cnt == 3)
                res[it->second] = "Bronze Medal";
            else
                res[it->second] = to_string(cnt);
            ++cnt;
        }
        return res;
    }
};