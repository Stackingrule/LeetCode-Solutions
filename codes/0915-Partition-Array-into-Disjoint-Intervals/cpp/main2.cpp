class Solution
{
public:
    int partitionDisjoint(vector<int> &A)
    {
        int partitionIdx = 0, preMax = A[0], curMax = preMax;
        for (int i = 1; i < A.size(); ++i)
        {
            curMax = max(curMax, A[i]);
            if (A[i] < preMax)
            {
                preMax = curMax;
                partitionIdx = i;
            }
        }
        return partitionIdx + 1;
    }
};