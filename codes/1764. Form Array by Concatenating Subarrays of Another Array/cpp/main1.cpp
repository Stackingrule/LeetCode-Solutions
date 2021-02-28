class Solution
{
public:
    bool canChoose(vector<vector<int>> &groups, vector<int> &nums)
    {
        int l = 0;
        int res = 0;
        for (auto g : groups)
        {
            int g_len = g.size();

            for (int i = l; i < nums.size() - g_len + 1; i++)
            {
                int j = 0;
                int cur = i;
                for (; j < g_len; j++, cur++)
                {
                    if (nums[cur] != g[j])
                    {
                        break;
                    }
                }
                if (j == g_len)
                {
                    l = i + g_len;
                    res++;
                    break;
                }
            }
        }
        return res == groups.size();
    }
};