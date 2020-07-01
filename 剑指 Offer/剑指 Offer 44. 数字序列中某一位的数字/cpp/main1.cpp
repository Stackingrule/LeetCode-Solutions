class Solution {
public:
    int findNthDigit(int n) {
    	long long a = 9, b = 1;
    	long long num = a * b;

    	while (num < n) {
    		a *= 10;
    		b++;
    		num += a * b;
    	}

    	num -= a * b;
    	int flag = n - num;
    	int s = (flag - 1) / b + a / 9;
    	string tmp = to_string(s);
    	int res;
    	res = tmp[(flag - 1) % b] - '0';
    	return res;
    }
};