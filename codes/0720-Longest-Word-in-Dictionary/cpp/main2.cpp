class Solution
{
public:
    string longestWord(vector<string> &words)
    {
        string res = "";
        int mxLen = 0;
        unordered_set<string> s(words.begin(), words.end());
        for (string word : words)
        {
            if (word.size() == 1)
                dfs(s, word, mxLen, res);
        }
        return res;
    }
    void dfs(unordered_set<string> &s, string word, int &mxLen, string &res)
    {
        if (word.size() > mxLen)
        {
            mxLen = word.size();
            res = word;
        }
        else if (word.size() == mxLen)
        {
            res = min(res, word);
        }
        for (char c = 'a'; c <= 'z'; ++c)
        {
            word.push_back(c);
            if (s.count(word))
                dfs(s, word, mxLen, res);
            word.pop_back();
        }
    }
};