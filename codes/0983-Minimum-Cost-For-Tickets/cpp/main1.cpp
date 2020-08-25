class Solution
{
public:
    int mincostTickets(vector<int> &days, vector<int> &costs)
    {
        int n = days.size();
        vector<int> f(n + 1, INT_MAX);

        f[0] = 0;
        days.insert(days.begin(), 0);

        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j >= 1 && days[i] - days[j] < 30; j--)
            {
                if (days[i] - days[j] < 1)
                    f[i] = min(f[i], f[j - 1] + costs[0]);

                if (days[i] - days[j] < 7)
                    f[i] = min(f[i], f[j - 1] + costs[1]);

                if (days[i] - days[j] < 30)
                    f[i] = min(f[i], f[j - 1] + costs[2]);
            }
        }

        return f[n];
    }
};