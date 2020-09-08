class Solution
{
public:
    int removeCoveredIntervals(vector<vector<int>> &intervals)
    {
        int n = intervals.size();
        auto cmp = [](const vector<int> &x, const vector<int> &y) {
            if (x[0] != y[0])
            {
                return x[0] < y[0];
            }
            return x[1] > y[1];
        };

        sort(intervals.begin(), intervals.end(), cmp);

        int r = -1;
        int res = n;
        for (int i = 0; i < n; ++i)
        {
            if (intervals[i][1] <= r)
            {
                res--;
            }
            else
            {
                r = intervals[i][1];
            }
        }
        return res;
    }
};