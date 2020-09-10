class Solution
{
public:
    string sortString(string s)
    {
        int n = s.size();
        vector<int> count(26, 0);

        for (char c : s)
            ++count[c - 'a'];

        string ans;

        while (n > 0)
        {
            for (int i = 0; i < 26; ++i)
            {
                if (count[i] > 0)
                {
                    ans += i + 'a';
                    count[i]--;
                    n--;
                }
            }

            for (int i = 25; i >= 0; --i)
            {
                if (count[i] > 0)
                {
                    ans += i + 'a';
                    count[i]--;
                    n--;
                }
            }
        }
        return ans;
    }
};