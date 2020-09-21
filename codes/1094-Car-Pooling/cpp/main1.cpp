/*
* 扫描线
*/
class Solution
{
public:
    bool carPooling(vector<vector<int>> &trips, int capacity)
    {
        vector<int> allTrip(1001);
        for (int i = 0; i < trips.size(); ++i)
        {
            for (int j = trips[i][1]; j < trips[i][2]; ++j)
            {
                allTrip[j] += trips[i][0];
                if (allTrip[j] > capacity)
                {
                    return false;
                }
            }
        }
        return true;
    }
};