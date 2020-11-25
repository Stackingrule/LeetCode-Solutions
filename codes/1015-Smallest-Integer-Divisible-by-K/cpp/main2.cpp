class Solution
{
public:
    int smallestRepunitDivByK(int K)
    {
        if (K == 1)
            return 1;
        vector<bool> r(K, false);
        int c = 1, len = 1;
        r[c] = true;
        while (1)
        {
            c = (c * 10 + 1) % K;
            len++;
            if (c == 0)
                return len;
            else if (r[c])
            {
                break;
            }
            r[c] = true;
        }
        return -1;
    }
};