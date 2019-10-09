class Solution {
public:
    int reverse(int x) {
    	if(x == 0)
    		return 0;

    	int sign = x > 0 ? 1 : -1;
    	long long reverseNum = 0;
    	long long num = abs(x);
    	while(num) {
    		reverseNum = reverseNum*10 + num%10;
    		num /= 10;
    	}

    	reverseNum = reverseNum*sign;
    	if(reverseNum > INT_MAX || reverseNum < INT_MIN)
    		return 0;
    	return reverseNum;
        
    }
};