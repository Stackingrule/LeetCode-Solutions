class Solution
{
public:
    int findKthPositive(vector<int> &arr, int k)
    {
        unordered_set<int> s(begin(arr), end(arr));
        for (int i = 1; i <= arr.back(); ++i)
        {
            if (!s.count(i))
                --k;
            if (k == 0)
                return i;
        }
        return arr.back() + k;
    }
};