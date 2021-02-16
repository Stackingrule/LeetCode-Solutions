class Solution
{
public:
    int lenLongestFibSubseq(vector<int> &A)
    {
        int res = 0, n = A.size();
        unordered_set<int> st(A.begin(), A.end());
        for (int i = 0; i < n; ++i)
        {
            for (int j = i + 1; j < n; ++j)
            {
                int a = A[i], b = A[j], cnt = 2;
                while (st.count(a + b))
                {
                    b = a + b;
                    a = b - a;
                    ++cnt;
                }
                res = max(res, cnt);
            }
        }
        return (res > 2) ? res : 0;
    }
};