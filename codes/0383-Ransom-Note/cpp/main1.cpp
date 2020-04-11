class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        vector<int> counts(128, 0);
        for (const char ch : magazine) {
        	++counts[ch];
        }
        for (const char ch : ransomNote) {
        	if (--counts[ch] < 0) return false;
        }
        return true;
    }
};