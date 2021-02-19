class Solution
{
public:
    int minKBitFlips(vector<int> &A, int K)
    {
        int res = 0, n = A.size(), flipped = 0;
        for (int i = 0; i < n; ++i)
        {
            if (i >= K)
                flipped -= A[i - K] / 2;
            if (flipped % 2 == A[i])
            {
                if (i + K > n)
                    return -1;
                A[i] += 2;
                ++flipped;
                ++res;
            }
        }
        return res;
    }
};