class Solution
{
public:
    string getSmallestString(int n, int k)
    {
        string result(n, 'a');

        k -= n;
        int i = n - 1;

        while (k)
        {
            int add = min(k, 'z' - result[i]);
            result[i] += add;
            k -= add;

            if (--i < 0)
                i = n - 1;
        }

        return result;
    }
};