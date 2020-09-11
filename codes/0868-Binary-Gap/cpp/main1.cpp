class Solution
{
public:
    int binaryGap(int N)
    {
        vector<int> pos;
        for (int i = 0; i < 32; ++i)
        {
            if (((N >> i) & 1) != 0)
                pos.push_back(i);
        }
        int res = 0, n = pos.size();
        for (int i = 1; i < n; ++i)
        {
            res = max(res, pos[i] - pos[i - 1]);
        }
        return res;
    }
};