class Solution
{
public:
    vector<int> finalPrices(vector<int> &prices)
    {
        stack<int> stk;
        vector<int> res(prices);
        for (int idx = 0; idx < prices.size(); idx++)
        {
            while (!stk.empty() && prices[idx] <= prices[stk.top()])
            {
                prices[stk.top()] = prices[stk.top()] - prices[idx];
                stk.pop();
            }
            stk.push(idx);
        }
        return prices;
    }
};