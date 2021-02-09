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
            ++numCnt[A[i]];
            while (numCnt.size() > K)
            {
                if (--numCnt[A[left]] == 0)
                    numCnt.erase(A[left]);
                ++left;
            }
            res += i - left + 1;
        }
        return res;
    }
};