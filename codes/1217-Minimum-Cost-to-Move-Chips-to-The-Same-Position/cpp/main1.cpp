class Solution
{
public:
    int minCostToMoveChips(vector<int> &position)
    {
        int odd = 0;
        int even = 0;
        for (int p : position)
        {
            if (p % 2 == 0)
            {
                ++odd;
            }
            else
            {
                ++even;
            }
        }
        return min(odd, even);
    }
};