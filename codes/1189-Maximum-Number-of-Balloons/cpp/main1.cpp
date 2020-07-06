class Solution {
public:
    int maxNumberOfBalloons(string text) {
        int A = 0, B = 0, L = 0, N = 0, O = 0;
        for (char c : text) {
        	if (c == 'a') A++;
        	else if (c == 'b') B++;
        	else if (c == 'l') L++;
        	else if (c == 'n') N++;
        	else if (c == 'o') O++;
        }
        L = L / 2;
        O = O / 2;
        int res = min(A, B);
        res = min(res, N);
        if (res == 0) {
            return 0;
        }
        
        if (L != 0 && O != 0) {
            res = min(res, L);
            res = min(res, O);
            return res;
        }

        return 0;
    }
};
