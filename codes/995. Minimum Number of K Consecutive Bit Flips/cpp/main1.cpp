class Solution
{
public:
    int minKBitFlips(vector<int> &A, int K)
    {
        int res = 0, n = A.size(), curFlipped = 0;
        vector<int> isFlipped(n);
        for (int i = 0; i < n; ++i)
        {
            if (i >= K)
                curFlipped ^= isFlipped[i - K];
            if (curFlipped % 2 == A[i])
            {
                if (i + K > n)
                    return -1;
                isFlipped[i] = 1;
                curFlipped ^= 1;
                ++res;
            }
        }
        return res;
    }
};