class Solution
{
public:
    int eraseOverlapIntervals(vector<vector<int>> &intervals)
    {
        int n = intervals.size(), res = 0, last = 0;
        sort(intervals.begin(), intervals.end());
        for (int i = 1; i < n; ++i)
        {
            if (intervals[i][0] < intervals[last][1])
            {
                ++res;
                if (intervals[i][1] < intervals[last][1])
                    last = i;
            }
            else
            {
                last = i;
            }
        }
        return res;
    }
};