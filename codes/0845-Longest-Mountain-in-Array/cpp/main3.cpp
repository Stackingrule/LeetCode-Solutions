class Solution
{
public:
    int longestMountain(vector<int> &A)
    {
        int res = 0, i = 0, n = A.size();
        while (i < n - 1)
        {
            while (i < n - 1 && A[i] >= A[i + 1])
                ++i;
            int peak = i;
            while (peak < n - 1 && A[peak] < A[peak + 1])
                ++peak;
            int j = peak;
            while (j < n - 1 && A[j] > A[j + 1])
                ++j;
            if (i < peak && peak < j)
                res = max(res, j - i + 1);
            i = j;
        }
        return res;
    }
};