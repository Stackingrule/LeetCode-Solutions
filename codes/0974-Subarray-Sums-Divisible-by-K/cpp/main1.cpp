class Solution
{
public:
    int subarraysDivByK(vector<int> &A, int K)
    {
        vector<int> C(K);
        C[0] = 1;
        int res = 0;
        int sum = 0;
        for (int a : A)
        {
            sum = (sum + a % K + K) % K;
            res += C[sum]++;
        }
        return res;
    }
};