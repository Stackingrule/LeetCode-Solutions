class Solution
{
public:
    int clumsy(int N)
    {
        long ret = 0;
        int index = 0;
        long v = 1;
        for (int n = N; n >= 1; --n)
        {
            if (index == 0)
            {
                v *= n;
            }
            else if (index == 1)
            {
                v = v * n;
            }
            else if (index == 2)
            {
                v = v / n;
                ret += v;
                v = -1;
            }
            else
            { // index == 3
                ret += n;
            }

            if (n == 1 && index < 2)
            {
                ret += v;
            }

            index = (index + 1) % 4;
        }
        return (int)ret;
    }
};