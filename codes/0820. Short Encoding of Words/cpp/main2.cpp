class Solution
{
public:
    int minimumLengthEncoding(vector<string> &words)
    {
        int res = 0;
        unordered_set<string> st(words.begin(), words.end());
        for (string word : st)
        {
            for (int i = 1; i < word.size(); ++i)
            {
                st.erase(word.substr(i));
            }
        }
        for (string word : st)
            res += word.size() + 1;
        return res;
    }
};