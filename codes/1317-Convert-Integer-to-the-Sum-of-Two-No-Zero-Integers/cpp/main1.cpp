class Solution
{
private:
    bool containZero(int i)
    {
        while (i > 0)
        {
            if (i % 10 == 0)
                return true;
            else
                i /= 10;
        }
        return false;
    }

public:
    vector<int> getNoZeroIntegers(int n)
    {
        int i = 1;
        for (; i < n; ++i)
        {
            if (!containZero(i) && !containZero(n - i))
            {
                break;
            }
        }
        return {i, n - i};
    }
};