class Solution {
public:
    string replaceSpaces(string S, int length) {
        string res; int i = 0;
        for (int i = 0; i < length ; i ++)
            if (S[i] == ' ') res += "%20";
            else res += S[i];
        return res;
    }
};