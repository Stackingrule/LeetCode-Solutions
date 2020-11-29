class Solution
{
public:
    bool canReach(vector<int> &arr, int start)
    {
        queue<int> q;
        vector<bool> vis(arr.size(), false);

        vis[start] = true;
        q.push(start);

        while (!q.empty())
        {
            int x = q.front();
            q.pop();
            if (arr[x] == 0)
                return true;

            if (x + arr[x] < arr.size() && !vis[x + arr[x]])
            {
                vis[x + arr[x]] = true;
                q.push(x + arr[x]);
            }

            if (x - arr[x] >= 0 && !vis[x - arr[x]])
            {
                vis[x - arr[x]] = true;
                q.push(x - arr[x]);
            }
        }

        return false;
    }
};