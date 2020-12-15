class Solution
{
public:
    int numberOfSubstrings(string s)
    {
        int a = 0;
        int b = 0;
        int c = 0;
        int cnt = 0;
        int begin = 0;
        for (int i = 0; i < s.size(); ++i)
        {
            if (s[i] == 'a') ++a;
            else if (s[i] == 'b') ++b;
            else ++c;

            while (a > 0 && b > 0 && c > 0)
            {
                cnt += s.size() - i;
                if (s[begin] == 'a') --a;
                else if (s[begin] == 'b') --b;
                else --c;
                ++begin;
            }
        }

        return cnt;
    }
};