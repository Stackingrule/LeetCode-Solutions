class Solution
{
public:
    string getSmallestString(int n, int k)
    {
        string ans(n, 'a');
        k -= n;
        for (int i = n - 1; i >= 0; --i)
        {
            int d = min(k, 25);
            ans[i] += d;
            k -= d;
        }
        return ans;
    }
};