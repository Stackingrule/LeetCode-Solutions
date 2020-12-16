class Solution
{
public:
    int countLargestGroup(int n)
    {
        vector<int> sum(40, 0);
        for (int i = 1; i <= n; i++)
        {
            int x = i, y = 0;
            while (x)
            {
                y += x % 10;
                x /= 10;
            }
            sum[y]++;
        }

        int ma = 0;
        for (int i = 1; i <= 36; i++)
            ma = max(ma, sum[i]);

        int ans = 0;
        for (int i = 1; i <= 36; i++)
            if (ma == sum[i])
                ans++;

        return ans;
    }
};