class Solution
{
public:
    int countPrimeSetBits(int L, int R)
    {
        int res = 0;
        unordered_set<int> primes{2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = L; i <= R; ++i)
        {
            int cnt = 0;
            for (int j = i; j > 0; j >>= 1)
            {
                cnt += j & 1;
            }
            res += primes.count(cnt);
        }
        return res;
    }
};