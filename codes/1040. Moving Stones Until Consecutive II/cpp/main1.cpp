class Solution
{
public:
    vector<int> numMovesStonesII(vector<int> &stones)
    {
        int n = stones.size();
        sort(stones.begin(), stones.end());
        int upper;
        int lower = n;
        // calculate upper bound
        upper = max(stones[n - 1] - stones[1] + 1 - n + 1, stones[n - 2] - stones[0] + 1 - n + 1);
        // calculate lower bound
        int start = 0;
        for (auto &&end = 0; end < n; ++end)
        {
            while (stones[end] - stones[start] + 1 > n)
            {
                start++;
            }
            if (stones[end] - stones[start] + 1 == n - 1 && end - start + 1 == n - 1)
            {
                lower = min(lower, 2);
            }
            else
            {
                lower = min(lower, n - (end - start + 1));
            }
        }
        return {lower, upper};
    }
};