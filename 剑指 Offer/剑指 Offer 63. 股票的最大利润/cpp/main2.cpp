class Solution {
public:
    int maxProfit(vector<int>& prices) {
    	const int n = prices.size();
    	if (n < 2) return 0;
    	int max_profit = 0;
        int min_prices = prices[0];
        for (int i = 1; i < n; ++i) {
            if (prices[i] < min_prices) min_prices = prices[i];
            int curProfit = prices[i] - min_prices;
            max_profit = max(max_profit, curProfit);
        }
        return max_profit;
    }
};