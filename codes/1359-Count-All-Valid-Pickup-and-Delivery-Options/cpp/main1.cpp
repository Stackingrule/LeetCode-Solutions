class Solution
{
public:
    #define LL long long
    int countOrders(int n)
    {
        const int mod = 1000000007;
        LL ans = 1;
        for (int i = 1; i <= n; i++)
            ans = ans * i * (2 * i - 1) % mod;

        return ans;
    }
};