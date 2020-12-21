class Solution
{
public:
    int numSubmat(vector<vector<int>> &mat)
    {
        int m = mat.size(), n = mat[0].size();
        int ans = 0;
        vector<int> height(n);
        for (int i = 0; i < m; ++i)
        {
            for (int j = 0; j < n; ++j)
            {
                height[j] = mat[i][j] == 0 ? 0 : height[j] + 1;
                for (int k = j, mn = height[j]; k >= 0 && mn > 0; k--)
                {
                    mn = min(mn, height[k]);
                    ans += mn;
                }
            }
        }
        return ans;
    }
};