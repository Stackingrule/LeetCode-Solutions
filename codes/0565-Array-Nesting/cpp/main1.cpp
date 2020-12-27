class Solution
{
public:
    int arrayNesting(vector<int> &nums)
    {
        int n = nums.size(), res = INT_MIN;
        vector<bool> visited(n, false);
        for (int i = 0; i < nums.size(); ++i)
        {
            if (visited[nums[i]])
                continue;
            res = max(res, helper(nums, i, visited));
        }
        return res;
    }
    int helper(vector<int> &nums, int start, vector<bool> &visited)
    {
        int i = start, cnt = 0;
        while (cnt == 0 || i != start)
        {
            visited[i] = true;
            i = nums[i];
            ++cnt;
        }
        return cnt;
    }
};