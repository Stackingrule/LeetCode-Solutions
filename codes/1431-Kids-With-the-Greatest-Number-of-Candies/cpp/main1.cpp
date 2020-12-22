class Solution
{
public:
    vector<bool> kidsWithCandies(vector<int> &candies, int extraCandies)
    {
        vector<bool> res;
        int mc = candies[0];
        // 找到 kids 目前手中的最大 candies
        for (int i = 1; i < candies.size(); ++i)
        {
            if (candies[i] > mc)
                mc = candies[i];
        }

        // kids 手中已知 greatest candies 保存在 mc 中
        for (int i = 0; i < candies.size(); ++i)
        {
            if (candies[i] + extraCandies >= mc)
            {
                res.push_back(true);
            }
            else
            {
                res.push_back(false);
            }
        }
        return res;
    }
};