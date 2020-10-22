class Solution
{
public:
    bool canThreePartsEqualSum(vector<int> &A)
    {
        int total = 0;
        for (int i = 0; i < A.size(); i++)
            total += A[i];

        if (total % 3 != 0)
            return false;

        int tempsum = 0;
        int count = 0;

        for (int i = 0; i < A.size(); i++)
        {
            tempsum += A[i];
            if (tempsum == total / 3)
            {
                count++;
                tempsum = 0;
            }
        }

        return count >= 3 ? true : false;
    }
};