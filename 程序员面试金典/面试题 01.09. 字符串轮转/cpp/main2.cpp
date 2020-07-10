class Solution {
public:
    bool isFlipedString(string s1, string s2) {
        int m = s1.size(), n = s2.size();
        if(m != n) return false;
        if(m == 0) return true;
        return (s1+s1).find(s2)!=-1;
    }
};
