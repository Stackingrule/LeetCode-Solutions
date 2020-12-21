class Solution
{
public:
    string arrangeWords(string text)
    {
        const int N = text.length();
        map<int, string> m;
        for (int i = 0; i < N; ++i)
        {
            if (i == 0)
                text[i] = tolower(text[i]);
            int l = i;
            while (i < N && text[i] != ' ')
                ++i;
            int length = i - l;
            m[length] = (m[length].empty() ? "" : m[length] + " ") + text.substr(l, length);
        }

        string ans;
        for (const auto &it : m)
        {
            ans = (ans.empty() ? "" : ans + " ") + it.second;
        }
        ans[0] = toupper(ans[0]);
        return ans;
    }
};