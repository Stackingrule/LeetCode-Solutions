class Solution
{
public:
    vector<int> sumEvenAfterQueries(vector<int> &A, vector<vector<int>> &queries)
    {
        vector<int> sums;
        int cursum = 0;
        for (int a : A)
        {
            if (a % 2 == 0)
            {
                cursum += a;
            }
        }
        for (auto q : queries)
        {
            if (A[q[1]] % 2 == 0)
            {
                cursum -= A[q[1]];
            }
            A[q[1]] += q[0];
            if (A[q[1]] % 2 == 0)
            {
                cursum += A[q[1]];
            }
            sums.push_back(cursum);
        }
        return sums;
    }
};