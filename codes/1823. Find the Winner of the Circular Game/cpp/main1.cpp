class Solution
{
public:
    int findTheWinner(int n, int k)
    {
        //f(n) = (f(n - 1) + k) % n;
        int p = 0;
        for (int i = 2; i <= n; ++i)
        {
            p = (p + k) % i;
        }
        return p + 1;
    }
};