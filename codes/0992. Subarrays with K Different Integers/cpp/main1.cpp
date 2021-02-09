class Solution
{
public:
    int subarraysWithKDistinct(vector<int> &A, int K)
    {
        return helper(A, K) - helper(A, K - 1);
    }
    int helper(vector<int> &A, int K)
    {
        int n = A.size(), res = 0, left = 0;
        unordered_map<int, int> numCnt;
        for (int i = 0; i < n; ++i)
        {
            if (numCnt[A[i]] == 0)
                --K;
            ++numCnt[A[i]];
            while (K < 0)
            {
                if (--numCnt[A[left]] == 0)
                    ++K;
                ++left;
            }
            res += i - left + 1;
        }
        return res;
    }
};