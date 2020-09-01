class Solution
{
public:
    string largestTimeFromDigits(vector<int> &A)
    {
        string res;
        for (int i = 0; i < 4; ++i)
        {
            for (int j = 0; j < 4; ++j)
            {
                for (int k = 0; k < 4; ++k)
                {
                    if (i == j || i == k || j == k)
                        continue;
                    string hour = {char(A[i] + '0'), char(A[j] + '0')}, minute = {char(A[k] + '0'), char(A[6 - i - j - k] + '0')}, t = hour + ":" + minute;
                    if (hour <= "23" && minute <= "59" && res < t)
                        res = t;
                }
            }
        }
        return res;
    }
};