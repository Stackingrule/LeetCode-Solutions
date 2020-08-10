class Solution {
public:
    string printBin(double num) {
        string res = "0.";
        int i = 30;
        while (num > 0 && i--) {
            num *= 2;
            if (num >= 1) {
                res.push_back('1');
                --num;
            }
            else res.push_back('0');
        }
        return num != 0 ? "ERROR" : res;
    }
};