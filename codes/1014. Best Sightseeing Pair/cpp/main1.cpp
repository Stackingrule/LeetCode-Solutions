class Solution
{
public:
    int maxScoreSightseeingPair(vector<int> &values)
    {
        if (values.empty())
            return 0;
        int ans = 0;
        int maxI = values[0] + 0;
        for (int j = 1; j < values.size(); ++j)
        {
            ans = max(ans, values[j] - j + maxI);
            maxI = max(maxI, values[j] + j);
        }
        return ans;
    }
};