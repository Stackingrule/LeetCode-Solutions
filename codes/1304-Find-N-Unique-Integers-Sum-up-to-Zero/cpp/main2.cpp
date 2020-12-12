class Solution
{
public:
    vector<int> sumZero(int n)
    {
        vector<int> ans(n);
        int left = 0, right = n - 1, start = 1;
        while (left < right)
        {
            ans[left++] = start;
            ans[right--] = -start;
            start++;
        }
        return ans;
    }
};