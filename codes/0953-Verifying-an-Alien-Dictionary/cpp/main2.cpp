class Solution
{
public:
    bool isAlienSorted(vector<string> &words, string order)
    {
        vector<int> charMap(26);
        for (int i = 0; i < order.size(); ++i)
        {
            charMap[order[i] - 'a'] = i;
        }
        for (string &word : words)
        {
            for (char &c : word)
            {
                c = charMap[c - 'a'];
            }
        }
        return is_sorted(words.begin(), words.end());
    }
};
