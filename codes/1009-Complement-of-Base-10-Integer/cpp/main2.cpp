class Solution
{
public:
    int bitwiseComplement(int N)
    {
        if (!N)
            return 1;

        int exponent = 0;
        int res = 0;

        while (N)
        {
            // 这里只考虑二进制为 0, 翻转后为 1 的情况
            if (!(N & 1))
                res += (1 << exponent);

            exponent++;
            N >>= 1;
        }
        return res;
    }
};