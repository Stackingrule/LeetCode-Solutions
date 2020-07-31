class Solution
{
public:
    vector<vector<int>> subsets(vector<int> &nums)
    {
        vector<vector<int>> res(1);
        size_t total = 1 << nums.size();
        for (size_t i = 0; i < total; ++i) {
            vector<int> vec;
            int num = i, idx = 0;
            while (num)
            {
                if (num & 1)
                {
                    vec.push_back(nums[idx]);
                }
                num >>= 1;
                ++idx;
            }
            res.push_back(vec);
        }
        return res;
    }
};