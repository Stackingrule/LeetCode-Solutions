class Solution
{
public:
    int removeStones(vector<vector<int>> &stones)
    {
        int cnt = 0, n = stones.size();
        vector<int> root(n, 0);
        for (int i = 0; i < n; ++i) root[i] = i;
        for (int i = 0; i < n; ++i)
        {
            for (int j = i + 1; j < n; ++j)
            {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1])
                {
                    root[getRoot(root, i)] = getRoot(root, j);
                }
            }
        }
        for (int i = 0; i < n; ++i)
        {
            if (root[i] == i)
                ++cnt;
        }
        return n - cnt;
    }

    int getRoot(vector<int> &root, int x)
    {
        return x == root[x] ? x : getRoot(root, root[x]);
    }
};