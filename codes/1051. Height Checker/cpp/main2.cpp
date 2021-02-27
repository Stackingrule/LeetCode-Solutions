class Solution
{
public:
    int heightChecker(vector<int> &heights)
    {
        vector<int> freq(101);
        for (int a : heights)
            ++freq[a];
        int ans = 0;
        int curHeight = 0;
        for (int i = 0; i < heights.size(); ++i)
        {
            while (freq[curHeight] == 0)
            {
                curHeight++;
            }
            if (curHeight != heights[i])
            {
                ++ans;
            }
            freq[curHeight]--;
        }

        return ans;
    }
};