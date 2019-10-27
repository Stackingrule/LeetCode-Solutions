#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int uniquePaths(int m, int n) {
    	std::vector<int> dp(n, 1);

    	for(int i = 1; i < m; ++i) {
    		for(int j = 1; j < n; ++j) {
    			dp[j] += dp[j - 1];
    		}
    	}
        return dp[n - 1];
    }
};

int main() {
	Solution solve;

	cout << solve.uniquePaths(3, 4) << endl;
	cout << solve.uniquePaths(3, 2) << endl;
	cout << solve.uniquePaths(7, 3) << endl;

	return 0;
}