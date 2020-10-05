class Solution
{
public:
    int numSubarraysWithSum(vector<int> &A, int S)
    {
        int res = 0, curSum = 0;
        unordered_map<int, int> m{{0, 1}};
        for (int num : A)
        {
            curSum += num;
            res += m[curSum - S];
            ++m[curSum];
        }
        return res;
    }
};