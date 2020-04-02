class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int res = 0, left = -1, n = s.size();
        vector<int> idx(256, -1);
        for (int i = 0; i < n; ++i) {
            left = max(left, idx[s[i]]);
            idx[s[i]] = i;
            res = max(res, i - left);
        }

        return res;
    }
};