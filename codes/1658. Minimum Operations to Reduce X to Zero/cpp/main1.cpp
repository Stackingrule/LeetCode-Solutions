class Solution
{
public:
    int minOperations(vector<int> &nums, int x)
    {
        int n = nums.size(), total = 0;
        for (int num : nums)
            total += num;

        int target = total - x;
        if (target < 0)
            return -1;
        if (target == 0)
            return n;

        int left = 0, right = 0, sum = 0, ans = -1;
        while (right < n)
        {
            if (sum < target)
            {
                sum += nums[right];
                right++;
            }
            while (sum >= target)
            {
                if (sum == target)
                {
                    ans = max(ans, right - left);
                }
                sum -= nums[left];
                left++;
            }
        }
        if (ans == -1)
        {
            return -1;
        }
        return n - ans;
    }
};