class Solution
{
public:
    int findIntegers(int num)
    {
        if (!num)
            return 0;
        int cnt = 0;
        while (1 << cnt <= num)
        {
            ++cnt;
        }
        vector<int> DP0(cnt + 1, 0);
        vector<int> DP1(cnt + 1, 0);
        DP0[1] = 1;
        DP1[1] = 1;
        for (int i = 2; i <= cnt; i++)
        {
            DP0[i] = DP0[i - 1] + DP1[i - 1];
            DP1[i] = DP0[i - 1];
        }
        bool last = false;
        bool obRule = true;
        int result = 0;
        while (--cnt >= 0)
        {
            //curr postion is 1
            if (1 << cnt & num)
            {
                result += DP0[cnt + 1];
                if (last)
                {
                    obRule = false;
                    break;
                }
                last = true;
            }
            //curr position is 0
            else
                last = false;
        }
        if (obRule)
            result += 1;
        return result;
    }
};