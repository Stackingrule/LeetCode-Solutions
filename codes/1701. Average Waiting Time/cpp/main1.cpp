class Solution
{
public:
    double averageWaitingTime(vector<vector<int>> &cs)
    {
        long long wait = 0;
        long long time = 0;
        int n = cs.size();
        for (int i = 0; i < n; i++)
        {
            if (time < cs[i][0])
                time = cs[i][0];
            time += cs[i][1];
            wait += time - cs[i][0];
        }
        double res = (double)wait / n;
        return res;
    }
};