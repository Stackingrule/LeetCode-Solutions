class Solution
{
public:
    int findMaximumXOR(vector<int> &nums)
    {
        int max = 0;
        int mask = 0;
        unordered_set<int> s;
        for (int i = 30; i >= 0; i--)
        {
            mask = mask | (1 << i);
            for (int value : nums)
            {
                s.insert(mask & value);
            }
            int candidate = max | (1 << i);
            for (int value : s)
            {
                if (s.count(candidate ^ value))
                {
                    max = candidate;
                    break;
                }
            }
            s.clear();
        }
        return max;
    }
};