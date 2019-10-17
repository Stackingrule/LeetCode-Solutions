class Solution {
private:
	std::vector<int> memo;

	int calWays(int n) {
		if(n == 0 || n == 1)
			return 1;
		if(memo[n] == -1)
			memo[n] = calWays(n - 1) + calWays(n - 2);

		return memo[n];
	}
public:
    int climbStairs(int n) {
    	memo = vector<int>(n + 1, -1);
    	return calWays(n);
        
    }
};