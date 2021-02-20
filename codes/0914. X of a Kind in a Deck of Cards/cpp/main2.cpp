class Solution
{
public:
    bool hasGroupsSizeX(vector<int> &deck)
    {
        unordered_map<int, int> cardCnt;
        for (int card : deck)
            ++cardCnt[card];
        int res = 0;
        for (auto &a : cardCnt)
        {
            res = gcd(a.second, res);
        }
        return res > 1;
    }
    int gcd(int a, int b)
    {
        return a == 0 ? b : gcd(b % a, a);
    }
};
