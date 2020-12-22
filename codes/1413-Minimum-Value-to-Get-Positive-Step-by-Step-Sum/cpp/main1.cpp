class Solution
{
public:
    int minStartValue(vector<int> &nums)
    {
        int s = 0, m = 1;
        for (int x : nums)
        {
            s -= x;
            m = max(m, s + 1);
        }

        return m;
    }
};