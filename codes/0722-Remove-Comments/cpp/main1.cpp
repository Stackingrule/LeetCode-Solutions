class Solution
{
public:
    vector<string> removeComments(vector<string> &src)
    {
        vector<string> res;
        string buf;
        string s;
        for (string ss : src)
            s += ss + '\n';

        for (int i = 0; i < s.size(); i++)
        {
            if (s[i] == '/' && i + 1 < s.size() && s[i + 1] == '*')
            {
                i += 3;
                while (!(s[i - 1] == '*' && s[i] == '/'))
                    i++;
                continue;
            }

            if (s[i] == '/' && i + 1 < s.size() && s[i + 1] == '/')
            {
                i += 2;
                while (i < s.size() && s[i] != '\n')
                    i++;
            }
            if (s[i] == '\n')
            {
                if (buf != "")
                    res.push_back(buf);
                buf = "";
            }
            else
            {
                buf += s[i];
            }
        }

        return res;
    }
};