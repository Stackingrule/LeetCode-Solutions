class Solution {
public:
    int translateNum(int num) {
    	if (num < 10) return 1;
    	if (num < 26) return 2;
    	if (num < 100) return 1;
    	else {
    		int res = 0;
    		int a = 1;
    		while (num / 10 >= a) a *= 10;
    		res = res + translateNum(num % a);
    		a /= 10;
    		if (num / a < 26) res = res + translateNum(num % a);
    		return res;
    	}
    }
};