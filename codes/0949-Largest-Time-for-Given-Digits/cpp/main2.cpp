class Solution
{
public:
    string largestTimeFromDigits(vector<int> &A)
    {
        for (int h = 23; h >= 0; --h)
        {
            for (int m = 59; m >= 0; --m)
            {
                vector<int> cnt(10);
                bool valid = true;
                ++cnt[h < 10 ? 0 : h / 10];
                ++cnt[h < 10 ? h : h % 10];
                ++cnt[m < 10 ? 0 : m / 10];
                ++cnt[m < 10 ? m : m % 10];
                for (int num : A)
                {
                    if (--cnt[num] < 0)
                    {
                        valid = false;
                        break;
                    }
                }
                string hour = to_string(h), minute = to_string(m);
                if (valid)
                    return (h < 10 ? "0" + hour : hour) + ":" + (m < 10 ? "0" + minute : minute);
            }
        }
        return "";
    }
};