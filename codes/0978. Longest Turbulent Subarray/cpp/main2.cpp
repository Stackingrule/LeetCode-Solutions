class Solution
{
public:
    int maxTurbulenceSize(vector<int> &arr)
    {
        int res = 1, n = arr.size();
        vector<int> dec(n, 1), inc(n, 1);
        for (int i = 1; i < n; ++i)
        {
            if (arr[i - 1] > arr[i])
            {
                dec[i] = inc[i - 1] + 1;
            }
            else if (arr[i - 1] < arr[i])
            {
                inc[i] = dec[i - 1] + 1;
            }
            res = max(res, max(dec[i], inc[i]));
        }
        return res;
    }
};