class Solution
{
public:
    int maximumSwap(int num)
    {
        string str = to_string(num);
        vector<int> buckets(10, 0);
        for (int i = 0; i < str.size(); ++i)
        {
            buckets[str[i] - '0'] = i;
        }
        for (int i = 0; i < str.size(); ++i)
        {
            for (int k = 9; k > str[i] - '0'; --k)
            {
                if (buckets[k] <= i)
                    continue;
                swap(str[i], str[buckets[k]]);
                return stoi(str);
            }
        }
        return num;
    }
};