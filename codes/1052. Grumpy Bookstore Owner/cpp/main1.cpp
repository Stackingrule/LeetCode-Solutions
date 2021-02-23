class Solution
{
public:
    int maxSatisfied(vector<int> &customers, vector<int> &grumpy, int X)
    {
        int n = customers.size(), sum = 0;
        vector<int> sum_grumpy(n);
        sum_grumpy[0] = grumpy[0] == 1 ? customers[0] : 0;
        sum = grumpy[0] == 0 ? customers[0] : 0;
        for (int i = 1; i < n; i++)
        {
            sum_grumpy[i] = sum_grumpy[i - 1];
            if (grumpy[i] == 1)
                sum_grumpy[i] += customers[i];
            else
                sum += customers[i];
        }

        int ans = sum_grumpy[X - 1];
        for (int i = 1; i < n - X + 1; i++)
            ans = max(ans, sum_grumpy[X + i - 1] - sum_grumpy[i - 1]);

        return ans + sum;
    }
};