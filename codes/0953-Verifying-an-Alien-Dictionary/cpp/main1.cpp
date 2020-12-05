class Solution
{
public:
    bool isAlienSorted(vector<string> &words, string order)
    {
        unordered_map<char, int> charMap;
        for (int i = 0; i < order.size(); ++i)
        {
            charMap[order[i]] = i;
        }
        for (int i = 1; i < words.size(); ++i)
        {
            string word1 = words[i - 1], word2 = words[i];
            int n1 = word1.size(), n2 = word2.size();
            for (int j = 0; j < n1 && j < n2; ++j)
            {
                if (word1[j] == word2[j])
                    continue;
                if (charMap[word1[j]] > charMap[word2[j]])
                    return false;
                else
                    break;
            }
            if (n1 > n2 && word1.substr(0, n2) == word2)
                return false;
        }
        return true;
    }
};