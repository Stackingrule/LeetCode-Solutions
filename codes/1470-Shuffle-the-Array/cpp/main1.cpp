class Solution
{
public:
    vector<int> shuffle(vector<int> &nums, int n)
    {
        vector<int> res(2 * n);
        for (int i = 0, j = 0; j < n; i += 2)
        {
            res[i] = nums[j];
            res[i + 1] = nums[j + n];
            j++;
        }
        return res;
    }
};