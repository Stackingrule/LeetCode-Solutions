class Solution {
    public int translateNum(int num) {
    	if (num < 10) return 1;
    	int x = num % 100;
    	if (10 <= x && x <= 25) {
    		return translateNum(num / 10) + translateNum(num / 100);
    	}
    	return translateNum(num / 10);
    }
}