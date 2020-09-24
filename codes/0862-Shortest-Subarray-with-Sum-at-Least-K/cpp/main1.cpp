class Solution
{
public:
    int shortestSubarray(vector<int> &A, int K)
    {
        int n = A.size(), res = INT_MAX;
        deque<int> q;
        vector<int> sum(n + 1);
        for (int i = 1; i <= n; ++i)
            sum[i] = sum[i - 1] + A[i - 1];
        for (int i = 0; i <= n; ++i)
        {
            while (!q.empty() && sum[i] - sum[q.front()] >= K)
            {
                res = min(res, i - q.front());
                q.pop_front();
            }
            while (!q.empty() && sum[i] <= sum[q.back()])
            {
                q.pop_back();
            }
            q.push_back(i);
        }
        return res == INT_MAX ? -1 : res;
    }
};