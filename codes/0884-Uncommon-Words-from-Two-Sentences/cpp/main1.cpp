class Solution {
public:
    vector<string> uncommonFromSentences(string A, string B) {
        vector<string> res;
        unordered_map<string, int> wordCnt;
        istringstream iss(A + " " + B);
        while (iss >> A) ++wordCnt[A];
        for (auto a : wordCnt) {
            if (a.second == 1) res.push_back(a.first);
        }
        return res;
    }
};