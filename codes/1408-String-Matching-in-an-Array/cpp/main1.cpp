class Solution {
public:
    bool check(const vector<string> &words, int i) {
        int n = words.size();
        for (int j = 0; j < n; j++)
            if (j != i)
                if (words[j].find(words[i]) != string::npos)
                    return true;

        return false;
    }

    vector<string> stringMatching(vector<string>& words) {
        int n = words.size();
        vector<string> ans;
        for (int i = 0; i < n; i++)
            if (check(words, i))
                ans.push_back(words[i]);

        return ans;
    }
};