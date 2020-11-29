class Solution
{
public:
    bool canReach(vector<int> &arr, int start)
    {
        vector<bool> vis(arr.size(), false);
        vis[start] = true;
        return dfs(start, arr, vis);
    }

    bool dfs(int x, const vector<int> &arr, vector<bool> vis)
    {
        if (arr[x] == 0) return true;

        if (x + arr[x] < arr.size() && !vis[x + arr[x]])
        {
            vis[x + arr[x]] = true;
            if (dfs(x + arr[x], arr, vis))
            {
                return true;
            }
        }

        if (x - arr[x] >= 0 && !vis[x - arr[x]])
        {
            vis[x - arr[x]] = true;
            if (dfs(x - arr[x], arr, vis))
            {
                return true;
            }
        }

        return false;
    }
};