class Solution
{
public:
    int minKBitFlips(vector<int> &A, int K)
    {
        int res = 0, n = A.size();
        queue<int> q;
        for (int i = 0; i < n; ++i)
        {
            if (!q.empty() && i >= (q.front() + K))
                q.pop();
            if (q.size() % 2 == A[i])
            {
                if (i + K > n)
                    return -1;
                q.push(i);
                ++res;
            }
        }
        return res;
    }
};