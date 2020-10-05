class Solution
{
public
    int bitwiseComplement(int N)
    {
        int sum = 0;
        if (N == 0)
            return 1;
        while (sum < N)
        {
            sum = (sum << 1) | 1;
        }
        return sum - N;
    }
}