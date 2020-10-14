class Solution
{
public:
    int maxProfit(vector<int> &prices, int fee)
    {
        int n = prices.size();
        vector<int> f(n + 1), g(n + 1);
        f[0] = 0;
        g[0] = -1000000000;

        for (int i = 1; i <= n; i++)
        {
            f[i] = max(f[i - 1], g[i - 1] + prices[i - 1] - fee);
            g[i] = max(g[i - 1], f[i - 1] - prices[i - 1]);
        }

        return f[n];
    }
};