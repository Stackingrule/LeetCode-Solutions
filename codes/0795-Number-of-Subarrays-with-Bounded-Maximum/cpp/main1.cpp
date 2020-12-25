class Solution
{
public:
    int numSubarrayBoundedMax(vector<int> &A, int L, int R)
    {
        return count(A, R) - count(A, L - 1);
    }

private:
    // Count # of sub arrays whose max element is <= N
    int count(const vector<int> &A, int N)
    {
        int ans = 0;
        int cur = 0;
        for (int a : A)
        {
            if (a <= N)
                ans += ++cur;
            else
                cur = 0;
        }
        return ans;
    }
};