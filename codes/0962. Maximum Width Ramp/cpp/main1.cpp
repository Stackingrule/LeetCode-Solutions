class Solution
{
public:
    int maxWidthRamp(vector<int> &A)
    {
        int n = A.size(), ans = 0;
        vector<int> idx;
        for (int i = 0; i < n; ++i)
        {
            if (idx.size() == 0 || A[i] < A[idx.back()])
            {
                idx.push_back(i);
            }
            else
            {
                int left = 0, right = idx.size() - 1;
                while (left < right)
                {
                    int mid = left + (right - left) / 2;
                    if (A[idx[mid]] > A[i])
                    {
                        left = mid + 1;
                    }
                    else
                    {
                        right = mid;
                    }
                }
                ans = max(ans, i - idx[right]);
            }
        }
        return ans;
    }
};