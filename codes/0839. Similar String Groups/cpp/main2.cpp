class Solution
{
public:
    int numSimilarGroups(vector<string> &A)
    {
        int res = 0, n = A.size();
        vector<bool> visited(n);
        queue<string> q;
        for (int i = 0; i < n; ++i)
        {
            if (visited[i])
                continue;
            visited[i] = true;
            ++res;
            q.push(A[i]);
            while (!q.empty())
            {
                string t = q.front();
                q.pop();
                for (int j = 0; j < n; ++j)
                {
                    if (visited[j])
                        continue;
                    int diff = 0;
                    for (int k = 0; k < A[j].size(); ++k)
                    {
                        if (t[k] == A[j][k])
                            continue;
                        if (++diff > 2)
                            break;
                    }
                    if (diff == 0)
                        visited[j] = true;
                    if (diff == 2)
                    {
                        visited[j] = true;
                        q.push(A[j]);
                    }
                }
            }
        }
        return res;
    }
};