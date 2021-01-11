class Solution
{
public:
    vector<int> f, sz;

    int find(int x)
    {
        return x == f[x] ? x : f[x] = find(f[x]);
    }

    string smallestStringWithSwaps(string s, vector<vector<int>> &pairs)
    {
        int n = s.length();
        f.resize(n);
        sz.resize(n);
        for (int i = 0; i < n; i++)
        {
            f[i] = i;
            sz[i] = 1;
        }

        for (const auto &pr : pairs)
        {
            int fx = find(pr[0]), fy = find(pr[1]);
            if (fx != fy)
            {
                if (sz[fx] < sz[fy])
                {
                    f[fx] = fy;
                    sz[fy] += sz[fx];
                }
                else
                {
                    f[fy] = fx;
                    sz[fx] += sz[fy];
                }
            }
        }

        vector<vector<char>> a(n);
        vector<vector<int>> pos(n);
        for (int i = 0; i < n; i++)
        {
            a[find(i)].push_back(s[i]);
            pos[find(i)].push_back(i);
        }

        for (int i = 0; i < n; i++)
            sort(a[i].begin(), a[i].end());

        string ans(n, '0');
        for (int i = 0; i < n; i++)
            for (int j = 0; j < a[i].size(); j++)
                ans[pos[i][j]] = a[i][j];

        return ans;
    }
};
