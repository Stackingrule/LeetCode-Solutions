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
        unordered_map<int, int> num2idx;
        for (int i = 0; i < n; ++i)
        {
            num2idx[A[i]] = i;
            while (num2idx.size() > K)
            {
                if (num2idx[A[left]] == left)
                    num2idx.erase(A[left]);
                ++left;
            }
            res += i - left + 1;
        }
        return res;
    }
};