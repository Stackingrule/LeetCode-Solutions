class Solution
{
public:
    string longestWord(vector<string> &words)
    {
        string ans = "";
        int maxLen = 0;
        unordered_set<string> s(words.begin(), words.end());
        queue<string> q;
        for (string s : words)
        {
            if (s.size() == 1)
                q.push(s);
        }
        while (!q.empty())
        {
            string t = q.front();
            q.pop();
            if (t.size() > maxLen)
            {
                maxLen = t.size();
                ans = t;
            }
            else if (t.size() == maxLen)
            {
                ans = min(ans, t);
            }
            for (char c = 'a'; c <= 'z'; ++c)
            {
                t.push_back(c);
                if (s.count(t))
                    q.push(t);
                t.pop_back();
            }
        }
        return ans;
    }
};