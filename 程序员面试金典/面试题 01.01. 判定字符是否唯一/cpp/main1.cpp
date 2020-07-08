class Solution {
public:
    bool isUnique(string astr) {
        sort(astr.begin(), astr.end());
        for (int i = 1; i < astr.size(); ++i) {
            if (astr[i - 1] == astr[i]) {
                return false;
            }
        }
        return true;
    }
};