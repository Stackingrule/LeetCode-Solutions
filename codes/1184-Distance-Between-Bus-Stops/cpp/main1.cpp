class Solution
{
public:
    int distanceBetweenBusStops(vector<int> &distance, int start, int destination)
    {
        int n = distance.size();
        int tot = 0;
        for (int i = 0; i < n; i++)
            tot += distance[i];

        int ans = 0;
        while (start != destination)
        {
            ans += distance[start];
            start++;
            if (start == n)
                start = 0;
        }
        return min(ans, tot - ans);
    }
};