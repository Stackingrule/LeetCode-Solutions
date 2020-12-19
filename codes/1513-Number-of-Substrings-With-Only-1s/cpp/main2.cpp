class Solution
{
public:
    int numSub(string s)
    {
        constexpr int kMod = 1e9 + 7;
        long ans = 0;
        int cur = 0;
        for (char c : s)
        {
            cur = c == '1' ? cur + 1 : 0;
            ans += cur;
        }
        return ans % kMod;
    }
};