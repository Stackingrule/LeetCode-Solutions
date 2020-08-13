class Solution
{
public:
    int threeSumMulti(vector<int> &A, int target)
    {
        int res = 0, n = A.size(), M = 1e9 + 7;
        unordered_map<int, int> numCnt;
        for (int i = 0; i < n; ++i) 
        {
            res = (res + numCnt[target - A[i]]) % M;
            for (int j = 0; j < i; ++j) 
            {
                int sum = A[i] + A[j];
                ++numCnt[sum];
            }
        }
        return res;
    }
};