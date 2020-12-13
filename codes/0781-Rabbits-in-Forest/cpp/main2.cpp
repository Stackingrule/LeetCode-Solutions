class Solution
{
public:
    int numRabbits(vector<int> &answers)
    {
        int res = 0;
        vector<int> cnt(1000, 0);
        for (int ans : answers)
            cnt[ans] = (cnt[ans] + 1) % (ans + 1);
        for (int i = 0; i < 1000; ++i)
        {
            if (cnt[i] != 0)
                res += i + 1 - cnt[i];
        }
        return res + answers.size();
    }
};