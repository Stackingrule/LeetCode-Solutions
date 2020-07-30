class Solution
{
public:
    vector<vector<int>> pairSums(vector<int> &nums, int target)
    {
        vector<vector<int>> res;
        unordered_map<int, int> m;
        for (auto num : nums)
        {
            if (m[target - num] > 0) {
                m[target - num]--;
                res.push_back({target - num, num});
            }
            else m[num]++;
        }
        return res;
    }
};