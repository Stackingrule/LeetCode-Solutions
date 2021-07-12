class Solution {
public:
    bool isIsomorphic(string s, string t) {
        return isIs(s, t) && isIs(t, s);
    }

    bool isIs(string s, string t) {
        unordered_map<char, char> m;
        for (int i = 0; i < s.size(); ++i) {
            if (m.count(s[i])) {
                if (m[s[i]] != t[i])
                    return false;
            } else {
                m[s[i]] = t[i];
            }
        }
        return true;
    }
};