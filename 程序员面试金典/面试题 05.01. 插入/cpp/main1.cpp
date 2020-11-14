class Solution
{
public:
    int insertBits(int N, int M, int i, int j)
    {
        int mask = ((1 << (j - i + 1)) - 1) << i;
        mask = ~mask;
        N &= mask;
        M = M << i;
        return M | N;
    }
};