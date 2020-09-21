class Solution
{
public:
    bool carPooling(vector<vector<int>> &trips, int capacity)
    {
        vector<int> counter(1001);
        for (int i = 0; i < trips.size(); ++i)
        {
            counter[trips[i][1]] += trips[i][0];
            counter[trips[i][2]] -= trips[i][0];
        }
        int cap = 0;
        for (int i = 0; i < 1001; ++i)
        {
            cap += counter[i];
            if (cap > capacity)
            {
                return false;
            }
        }
        return true;
    }
};