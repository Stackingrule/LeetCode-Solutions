class Solution
{
public:
    int convertInteger(int A, int B)
    {
        unsigned int a =  A, b = B;
        int cnt = 0;
        while (a != 0 || b != 0)
        {
            cnt += (a & 1) ^ (b & 1);
            a >>= 1;
            b >>= 1;
        }
        return cnt;
    }
};