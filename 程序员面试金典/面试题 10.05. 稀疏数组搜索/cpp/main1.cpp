class Solution {
public:
    int findString(vector<string>& words, string s)
    {
        auto it = find(words.begin(), words.end(), s);
        if (it != words.end()) return it - words.begin();
        else return -1;
    }
};