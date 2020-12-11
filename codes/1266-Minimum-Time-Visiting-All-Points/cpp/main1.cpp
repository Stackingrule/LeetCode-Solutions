class Solution
{
public:
    int minTimeToVisitAllPoints(vector<vector<int>> &points)
    {
        int rows = points.size();
        int minTime = 0;
        for (int i = 0; i < rows - 1; ++i)
        {
            int xdiff = abs(points[i][0] - points[i + 1][0]);
            int ydiff = abs(points[i][1] - points[i + 1][1]);
            minTime += max(xdiff, ydiff);
        }
        return minTime;
    }
};