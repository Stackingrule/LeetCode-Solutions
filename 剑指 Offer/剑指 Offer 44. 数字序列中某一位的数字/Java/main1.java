class Solution {
    public int findNthDigit(int n) {
    	if (n <= 9) {
    		return n;
    	}
    	n--;
    	int num = 1;	// 位数
    	long first = 1;	// 当前范围内第一个数， 注意越界。
    	while (n > 9 * first * num) {
    		n -= 9 * first * num;	// 让n在循环结束后表示当前范围的第n位数字
    		num++;
    		first *= 10;
    	}

    	return String.valueOf(first + n / num).charAt(n % num) - '0';
    }
}