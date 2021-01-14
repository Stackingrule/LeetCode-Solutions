class Solution
{
public:
    int minOperations(vector<int> &nums, int x)
    {
        int size = nums.size();
        vector<int> left_sum(size + 1), right_sum(size + 1);

        left_sum[0] = 0;
        right_sum[0] = 0;

        unordered_map<int, int> left_map, right_map; //<sum, len>
        left_map[0] = 0;
        right_map[0] = 0;

        int operations = INT_MAX;

        for (int len = 1; len <= size; len++)
        {
            left_sum[len] = left_sum[len - 1] + nums[len - 1];
            if (left_sum[len] <= x)
            {
                int key = x - left_sum[len];
                if (right_map.count(key))
                {
                    operations = min(operations, len + right_map[key]);
                }

                left_map[left_sum[len]] = len;
            }

            right_sum[len] = right_sum[len - 1] + nums[size - len];
            if (right_sum[len] <= x)
            {
                int key = x - right_sum[len];
                if (left_map.count(key))
                {
                    operations = min(operations, len + left_map[key]);
                }

                right_map[right_sum[len]] = len;
            }
        }

        if (operations == INT_MAX || operations > size)
            return -1;
        else
            return operations;
    }
};