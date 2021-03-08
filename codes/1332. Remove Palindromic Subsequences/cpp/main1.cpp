class Solution {
public:
    int removePalindromeSub(string s) {
        const int N = s.length();
        if (N == 0) return 0;
        bool pal = true; 
        for (int i = 0, j = N - 1; i < j; ++i, --j) {
            if (s[i] != s[j]) {
                pal = false;
                break;
            }
        }
        if (pal) return 1;
        return 2;
    }
};