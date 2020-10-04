class Solution
{
public:
    int specialArray(vector<int> &nums)
    {
        unordered_map<int, int> count;

        for (auto num : nums)
        {
            for (int i = 1; i <= num; i++)
                count[i]++;
        }

        for (auto it : count)
        {
            if (it.first == it.second)
                return it.first;
        }

        return -1;
    }
};