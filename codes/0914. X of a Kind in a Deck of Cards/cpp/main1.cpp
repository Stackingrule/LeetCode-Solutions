class Solution
{
public:
    bool hasGroupsSizeX(vector<int> &deck)
    {
        unordered_map<int, int> cardCnt;
        for (int card : deck)
            ++cardCnt[card];
        int mn = INT_MAX;
        for (auto &a : cardCnt)
            mn = min(mn, a.second);
        if (mn < 2)
            return false;
        for (int i = 2; i <= mn; ++i)
        {
            bool success = true;
            for (auto &a : cardCnt)
            {
                if (a.second % i != 0)
                {
                    success = false;
                    break;
                }
            }
            if (success)
                return true;
        }
        return false;
    }
};
